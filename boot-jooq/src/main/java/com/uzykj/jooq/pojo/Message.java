package com.uzykj.jooq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.time.LocalDateTime;

/**
 * @Author xbh
 * @DateTime 19/2/20 下午1:17
 * @Description
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "用户信息")
public class Message {

    @ApiModelProperty(name = "id", dataType = "java.Lang.Integer")
    private Integer id;

    @ApiModelProperty(name = "sender", dataType = "java.Lang.String")
    private String sender;

    @ApiModelProperty(name = "phone", dataType = "java.Lang.String")
    private String phone;

    @ApiModelProperty(name = "time", dataType = "java.Lang.LocalDateTime")
    private LocalDateTime time;

    @ApiModelProperty(name = "message", dataType = "java.Lang.String")
    private String message;

    @ApiModelProperty(name = "user", dataType = "com.uzykj.jooq.pojo.User")
    private User user;
}
