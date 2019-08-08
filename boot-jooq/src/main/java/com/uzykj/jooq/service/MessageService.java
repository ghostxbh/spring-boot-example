package com.uzykj.jooq.service;


import com.uzykj.jooq.pojo.Message;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

import static com.uzykj.jooq.data.tables.Message.MESSAGE;

/**
 * @Author xbh
 * @DateTime 19/2/20 下午1:21
 * @Description
 */
@Service
@Transactional
public class MessageService {

    @Autowired
    private DSLContext dsl;

    public void add() {
        //TODU
    }

    public boolean delete(Integer id) {
        int execute = dsl.delete(MESSAGE).where(MESSAGE.ID.eq(id)).execute();
        return execute > 0 ? true : false;
    }

    public void update() {
        //TODU
    }

    public List<Message> messageByUser(Integer userId) {
        Result fetch = dsl.select(MESSAGE.ID, MESSAGE.SENDER, MESSAGE.PHONE, MESSAGE.TIME, MESSAGE.MESSAGE_)
                .from(MESSAGE)
                .where(MESSAGE.USER_ID.eq(userId))
                .fetch();
        if (fetch.size() > 0) {
            return fetch.into(com.uzykj.jooq.pojo.Message.class);
        } else {
            throw new RuntimeException();
        }
    }

    public List<Message> messageAll(Integer page, Integer size) {
        Result fetch = dsl.select(MESSAGE.ID, MESSAGE.SENDER, MESSAGE.PHONE, MESSAGE.TIME, MESSAGE.MESSAGE_)
                .from(MESSAGE)
                .limit(page, size)
                .fetch();
        if (null != fetch && fetch.size() > 0) {
            return fetch.into(com.uzykj.jooq.pojo.Message.class);
        } else {
            throw new RuntimeException();
        }
    }
}
