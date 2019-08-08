package com.uzykj.spring_boot_main.service;

import com.uzykj.spring_boot_main.model.Message;

/**
 * @Author xbh
 * @DateTime 19/2/21 上午9:56
 * @Description 邮件业务接口
 */
public interface MailService {
    /**
     * 简单邮件
     *
     * @param message
     */
    public String sendSimple(Message message);

    /**
     * HTML邮件
     *
     * @param message
     */
    public String sendHTML(Message message);

    /**
     * 附件邮件
     *
     * @param message
     */
    public String sendAtta(Message message);

    /**
     * 资源邮件
     *
     * @param message
     */
    public String sendResource(Message message);
}
