package com.uzykj.spring_boot_main.service.impl;

import com.alibaba.fastjson.JSON;
import com.uzykj.spring_boot_main.model.Message;
import com.uzykj.spring_boot_main.service.MailService;
import com.uzykj.spring_boot_main.utils.MailStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @Author xbh
 * @DateTime 19/2/21 上午9:57
 * @Description 邮件业务层
 */
@Service
@Slf4j
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String from;


    @Override
    @Async
    public String sendSimple(Message message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(message.getTo());
        /*String[] adds = {"xxx@qq.com","yyy@qq.com"}; //同时发送给多人
        simpleMailMessage.setTo(adds);*/
        simpleMailMessage.setSubject(message.getSubject());
        simpleMailMessage.setText(message.getContent());
        
        //邮件发送异常处理
        try {
            mailSender.send(simpleMailMessage);
            log.info(message.getTo() + "邮件地址已发送！");
            message.setStatus(MailStatus.SUCCESS);
            return JSON.toJSONString(message);
        } catch (Exception e) {
            log.error("邮件发送失败！错误信息：" + e.getMessage());
            throw new RuntimeException(MailStatus.FAIL.getMeg(),e);
        }

    }

    @Override
    @Async
    public String sendHTML(Message message) {
        //创建mine消息
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        //邮件发送异常处理
        try{
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setTo(message.getTo());
            helper.setSubject(message.getSubject());
            helper.setText(message.getContent(),true);
            //邮件发送
            mailSender.send(mimeMessage);
            log.info(message.getTo() + "邮件地址已发送！");
            message.setStatus(MailStatus.SUCCESS);
            return JSON.toJSONString(message);
        }catch (Exception e){
            log.error("邮件发送失败！错误信息：" + e.getMessage());
            throw new RuntimeException(MailStatus.FAIL.getMeg(),e);
        }
    }

    @Override
    @Async
    public String sendAtta(Message message) {
        //创建mine消息
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try{
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setTo(message.getTo());
            helper.setSubject(message.getSubject());
            helper.setText(message.getContent());

            //创建文件系统资源
            FileSystemResource file = new FileSystemResource(new File(message.getFilePath()));
            String fileName = message.getFilePath().substring(message.getFilePath().lastIndexOf(File.separator));

            //添加附件
            helper.addAttachment(fileName, file);

            // 邮件发送
            mailSender.send(mimeMessage);
            log.info(message.getTo() + "邮件地址已发送！");
            message.setStatus(MailStatus.SUCCESS);
            return JSON.toJSONString(message);
        }catch (Exception e){
            log.error("邮件发送失败！错误信息：" + e.getMessage());
            throw new RuntimeException(MailStatus.FAIL.getMeg(),e);
        }
    }

    @Override
    @Async
    public String sendResource(Message message) {
        //创建mine消息
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try{
            //true表示需要创建一个multipart message
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
            helper.setTo(message.getTo());
            helper.setSubject(message.getSubject());
            helper.setText(message.getContent());

            FileSystemResource res = new FileSystemResource(new File(message.getResourcePath()));
            //添加内联资源，一个id对应一个资源，最终通过id来找到该资源
            helper.addInline(message.getResourceId(), res);//添加多个图片可以使用多条 <img src='cid:" + rscId + "' > 和 helper.addInline(rscId, res) 来实现

            // 邮件发送
            mailSender.send(mimeMessage);
            log.info(message.getTo() + "邮件地址已发送！");
            message.setStatus(MailStatus.SUCCESS);
            return JSON.toJSONString(message);
        }catch (Exception e){
            log.error("邮件发送失败！错误信息：" + e.getMessage());
            throw new RuntimeException(MailStatus.FAIL.getMeg(),e);
        }
    }
}
