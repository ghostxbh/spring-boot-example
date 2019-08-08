package club.aiit.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Person {

    private String name;

    private Integer age;

    @JSONField(format = "yyyy-MM-dd")
    private Date birthDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
