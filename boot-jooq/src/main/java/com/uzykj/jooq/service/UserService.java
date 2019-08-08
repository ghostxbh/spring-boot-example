package com.uzykj.jooq.service;

import com.uzykj.jooq.pojo.Message;
import com.uzykj.jooq.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.uzykj.jooq.data.tables.User.USER;

/**
 * @Author xbh
 * @DateTime 19/2/20 下午1:18
 * @Description
 */

@Service
@Transactional
@Slf4j
public class UserService {

    @Autowired
    private DSLContext dsl;
    @Autowired
    private MessageService messageService;

    public UserService() {
    }

    public User add(User user) {
        String sql = dsl.insertInto(USER)
                .columns(USER.NAME, USER.AGE, USER.PHONE, USER.ADDRESS, USER.JOB, USER.OTHER)
                .values(user.getName(), user.getAge(), user.getPhone(), user.getAddress(), user.getJob(), user.getOther())
                .getSQL();
        log.info(sql);
        int execute = dsl.insertInto(USER)
                .columns(USER.NAME, USER.AGE, USER.PHONE, USER.ADDRESS, USER.JOB, USER.OTHER)
                .values(user.getName(), user.getAge(), user.getPhone(), user.getAddress(), user.getJob(), user.getOther())
                .execute();
        if (execute > 0 ? false : true) {
            log.info("更新成功");
            List<Long> longList = dsl.fetch("select last_insert_id()").into(Long.class);
            log.info("获取添加的ID：" + longList.get(0));
            return dsl.select().from(USER).where(USER.ID.eq(Integer.parseInt(String.valueOf(longList.get(0))))).fetch().into(User.class).get(0);
        } else {
            throw new RuntimeException();
        }
    }

    public boolean delete(Integer id) {
        int execute = dsl.delete(USER).where(USER.ID.eq(id)).execute();
        if (execute > 0) {
            return true;
        } else {
            throw new RuntimeException();
        }

    }

    public User update(User user) {
        String sql = dsl.update(USER)
                .set(USER.NAME, user.getName())
                .set(USER.AGE, user.getAge())
                .set(USER.PHONE, user.getPhone())
                .set(USER.ADDRESS, user.getAddress())
                .set(USER.JOB, user.getJob())
                .set(USER.OTHER, user.getOther())
                .where(USER.ID.eq(user.getId())).getSQL();
        log.info(sql);
        int execute = dsl.update(USER).set(USER.NAME, user.getName())
                .set(USER.AGE, user.getAge())
                .set(USER.PHONE, user.getPhone())
                .set(USER.ADDRESS, user.getAddress())
                .set(USER.JOB, user.getJob())
                .set(USER.OTHER, user.getOther())
                .where(USER.ID.eq(user.getId()))
                .execute();
        if (execute > 0) {
            log.info("更新成功");
            return new UserService().user(user.getId());
        } else {
            throw new RuntimeException();
        }
    }

    public User user(Integer id) {
        Result<Record> fetch = dsl.select()
                .from(USER)
                .where(USER.ID.eq(id))
                .fetch();
        if (fetch.size() > 0) {
            User user = fetch.into(User.class).get(0);
            List<Message> messages = messageService.messageByUser(id);
            if (messages.size() > 0) {
                user.setMessageList(messages);
            }
            return user;
        } else {
            throw new RuntimeException();
        }

    }

    public List<User> users(Integer page, Integer size) {
        Result<Record> fetch = dsl.select()
                .from(USER)
                .limit(page, size)
                .fetch();
        if (fetch.size() > 0) {
            List<User> userList = fetch.into(User.class);
            for (User user : userList) {
                List<Message> messageList = messageService.messageByUser(user.getId());
                if (messageList.size() > 0) {
                    user.setMessageList(messageList);
                }
            }
            return userList;
        }
        return null;
    }

}
