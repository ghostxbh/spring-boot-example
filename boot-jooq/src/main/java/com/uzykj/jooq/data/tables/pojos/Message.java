/*
 * This file is generated by jOOQ.
*/
package com.uzykj.jooq.data.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Message implements Serializable {

    private static final long serialVersionUID = -1832870266;

    private Integer       id;
    private String        sender;
    private String        phone;
    private LocalDateTime time;
    private String        message;
    private Integer       userId;

    public Message() {}

    public Message(Message value) {
        this.id = value.id;
        this.sender = value.sender;
        this.phone = value.phone;
        this.time = value.time;
        this.message = value.message;
        this.userId = value.userId;
    }

    public Message(
        Integer       id,
        String        sender,
        String        phone,
        LocalDateTime time,
        String        message,
        Integer       userId
    ) {
        this.id = id;
        this.sender = sender;
        this.phone = phone;
        this.time = time;
        this.message = message;
        this.userId = userId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getTime() {
        return this.time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Message (");

        sb.append(id);
        sb.append(", ").append(sender);
        sb.append(", ").append(phone);
        sb.append(", ").append(time);
        sb.append(", ").append(message);
        sb.append(", ").append(userId);

        sb.append(")");
        return sb.toString();
    }
}
