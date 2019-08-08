package com.uzykj.jooq.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * @Author xbh
 * @DateTime 19/2/20 下午1:14
 * @Description
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@ApiModel(value = "用户信息")
public class User {

    @ApiModelProperty(name = "id", dataType = "java.Lang.Integer")
    private Integer id;

    @ApiModelProperty(name = "name", dataType = "java.Lang.String")
    private String name;

    @ApiModelProperty(name = "age", dataType = "java.Lang.Integer")
    private Integer age;

    @ApiModelProperty(name = "phone", dataType = "java.Lang.String")
    private String phone;

    @ApiModelProperty(name = "address", dataType = "java.Lang.String")
    private String address;

    @ApiModelProperty(name = "job", dataType = "java.Lang.String")
    private String job;

    @ApiModelProperty(name = "other", dataType = "java.Lang.String")
    private String other;

    @ApiModelProperty(name = "messageList", dataType = "java.Util.List")
    private List<Message> messageList;
}
