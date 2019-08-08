package com.uzykj.jooq.web;


import com.uzykj.jooq.pojo.User;
import com.uzykj.jooq.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author xbh
 * @DateTime 19/2/20 下午1:43
 * @Description
 */
@Controller
@RequestMapping("/user")
@Slf4j
@Api(value = "用户API", description = "提供用户的CRUD接口")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "user", notes = "根据id获取用户")
    public User user(@RequestParam Integer id) {
        return userService.user(id);
    }

    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "users", notes = "获取所有用户，并分页")
    public List<User> users(@RequestParam Integer page, @RequestParam Integer size) {
        return userService.users(page, size);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "add", notes = "增加新用户")
    public User add(@RequestBody User user) {
        return userService.add(user);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value = "delete", notes = "删除用户")
    public String delete(@RequestParam Integer id) {
        boolean delete = userService.delete(id);
        return delete == true ? "Exception" : "deleted";
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "update", notes = "更新用户信息")
    public User update(@RequestBody User user) {
        return userService.update(user);
    }
}
