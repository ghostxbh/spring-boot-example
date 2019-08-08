/*
 * This file is generated by jOOQ.
*/
package com.uzykj.jooq.data.tables.records;


import com.uzykj.jooq.data.tables.Message;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MessageRecord extends UpdatableRecordImpl<MessageRecord> implements Record6<Integer, String, String, LocalDateTime, String, Integer> {

    private static final long serialVersionUID = -942752391;

    /**
     * Setter for <code>springboot.message.id</code>. ID
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>springboot.message.id</code>. ID
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>springboot.message.sender</code>. 接收人
     */
    public void setSender(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>springboot.message.sender</code>. 接收人
     */
    public String getSender() {
        return (String) get(1);
    }

    /**
     * Setter for <code>springboot.message.phone</code>. 接收人手机
     */
    public void setPhone(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>springboot.message.phone</code>. 接收人手机
     */
    public String getPhone() {
        return (String) get(2);
    }

    /**
     * Setter for <code>springboot.message.time</code>. 时间
     */
    public void setTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>springboot.message.time</code>. 时间
     */
    public LocalDateTime getTime() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>springboot.message.message</code>. 信息
     */
    public void setMessage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>springboot.message.message</code>. 信息
     */
    public String getMessage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>springboot.message.user_id</code>. 用户id
     */
    public void setUserId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>springboot.message.user_id</code>. 用户id
     */
    public Integer getUserId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, LocalDateTime, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, String, String, LocalDateTime, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Message.MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Message.MESSAGE.SENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Message.MESSAGE.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field4() {
        return Message.MESSAGE.TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Message.MESSAGE.MESSAGE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Message.MESSAGE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime component4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value4() {
        return getTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value2(String value) {
        setSender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value3(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value4(LocalDateTime value) {
        setTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value5(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value6(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord values(Integer value1, String value2, String value3, LocalDateTime value4, String value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MessageRecord
     */
    public MessageRecord() {
        super(Message.MESSAGE);
    }

    /**
     * Create a detached, initialised MessageRecord
     */
    public MessageRecord(Integer id, String sender, String phone, LocalDateTime time, String message, Integer userId) {
        super(Message.MESSAGE);

        set(0, id);
        set(1, sender);
        set(2, phone);
        set(3, time);
        set(4, message);
        set(5, userId);
    }
}
