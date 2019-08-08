package club.aiit.controller;

import club.aiit.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ghostxbh
 * @date 28/01/2019 23:26
 */
@RestController
public class PersonController {
    @Value("${xiaoming.sex}")
    private String sex;
    @Value("${xiaoming.age}")
    private Integer age;
    @Value("${xiaoming.score}")
    private Integer score;

    @RequestMapping("/xiaoming")
    public String get() {
        return String.format("小明==》性别：%s-----年龄：%s-----分数：%s", sex, age, score);
    }

    @Autowired
    private Person person;

    @RequestMapping("/person")
    public String getPerson() {
        return String.format("姓名：%s-----年龄：%s", person.getName(), person.getAge());
    }

    private static final String hello = "springboot.test";
    @Autowired
    private Environment environment;

    @RequestMapping("/enviro")
    public String getenv() {
        return String.format("测试Environment：" + environment.getProperty(hello));
    }
}
