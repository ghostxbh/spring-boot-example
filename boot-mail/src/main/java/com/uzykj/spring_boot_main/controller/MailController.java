package com.uzykj.spring_boot_main.controller;

import com.uzykj.spring_boot_main.model.Message;
import com.uzykj.spring_boot_main.service.MailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author xbh
 * @DateTime 19/2/21 上午9:58
 * @Description 邮件API
 */

@Controller
@RequestMapping("/mail")
@Api(value = "邮件API", description = "邮件推送的API接口")
public class MailController {

    @Autowired
    private MailService service;

    @PostMapping("/simple")
    @ResponseBody
    @ApiOperation(value = "简单邮件", notes = "简单方式的推送邮件")
    @ApiImplicitParam(name = "message",value = "{\"to\":\"405963225@qq.com\",\"subject\":\"老友相聚活动\",\"content\":\"时间：2019/10/01\n地点：北京\n内容：老友相聚活动\"}")
    public String simple(@RequestBody Message message) {
        return service.sendSimple(message);
    }

    @PostMapping("/html")
    @ResponseBody
    @ApiOperation(value = "HTML超文本邮件", notes = "HTML推送的邮件信息")
    public String html(@RequestBody Message message) {
        return service.sendHTML(message);
    }

    @PostMapping("/atta")
    @ResponseBody
    @ApiOperation(value = "附件邮件", notes = "带有附件的邮件")
    public String atta(@RequestBody Message message) {
        return service.sendAtta(message);
    }

    @PostMapping("/resource")
    @ResponseBody
    @ApiOperation(value = "资源邮件", notes = "带有静态资源的邮件")
    public String resource(@RequestBody Message message) {
        return service.sendResource(message);
    }
}
