/*
 * This file is generated by jOOQ.
*/
package com.uzykj.jooq.data.tables.pojos;


import java.io.Serializable;

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
public class User implements Serializable {

    private static final long serialVersionUID = -912219755;

    private Integer id;
    private String  name;
    private Integer age;
    private String  phone;
    private String  address;
    private String  job;
    private String  other;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.name = value.name;
        this.age = value.age;
        this.phone = value.phone;
        this.address = value.address;
        this.job = value.job;
        this.other = value.other;
    }

    public User(
        Integer id,
        String  name,
        Integer age,
        String  phone,
        String  address,
        String  job,
        String  other
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.job = job;
        this.other = other;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getOther() {
        return this.other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(age);
        sb.append(", ").append(phone);
        sb.append(", ").append(address);
        sb.append(", ").append(job);
        sb.append(", ").append(other);

        sb.append(")");
        return sb.toString();
    }
}
