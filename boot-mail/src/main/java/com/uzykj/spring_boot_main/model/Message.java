package com.uzykj.spring_boot_main.model;

import com.uzykj.spring_boot_main.utils.MailStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @Author xbh
 * @DateTime 19/2/21 上午9:52
 * @Description 邮件消息对象
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "推送信息",description = "邮件推送信息的信息对象")
public class Message {

    @ApiModelProperty(name = "to",value = "接受人邮箱地址",dataType = "java.Lang.String",required = true)
    private String to;

    @ApiModelProperty(name = "subject",value = "主题：老友相聚活动",dataType = "java.Lang.String",required = true)
    private String subject;

    @ApiModelProperty(name = "content",value = "内容：XX时间在XX地点举行老友相聚活动",dataType = "java.Lang.String",required = true)
    private String content;

    @ApiModelProperty(name = "filePath",value = "附件地址",dataType = "java.Lang.String")
    private String filePath;

    @ApiModelProperty(name = "resourcePath",value = "资源地址",dataType = "java.Lang.String")
    private String resourcePath;

    @ApiModelProperty(name = "resourceId",value = "资源编号",dataType = "java.Lang.String")
    private String resourceId;

    @ApiModelProperty(name = "status",value = "邮件状态",dataType = "java.Lang.Enum")
    private MailStatus status;
}
