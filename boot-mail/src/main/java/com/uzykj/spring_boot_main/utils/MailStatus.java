package com.uzykj.spring_boot_main.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author xbh
 * @DateTime 19/2/21 上午10:47
 * @Description 邮件状态枚举
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum MailStatus {
    SUCCESS(1, "成功发送邮件"),
    FAIL(0, "发送邮件失败");

    private Integer code;
    private String meg;
}
