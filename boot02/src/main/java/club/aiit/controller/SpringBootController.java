package club.aiit.controller;

import club.aiit.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class SpringBootController {

    @ResponseBody
    @RequestMapping("/xiaoming")
    public Person getPerson() {
        Person p = new Person();
        p.setName("小明");
        p.setAge(18);
        p.setBirthDay(new Date());
        return p;
    }

    @RequestMapping("/hello")
    public String getDate(Date birth, Model model) {
        model.addAttribute("birth", birth);
        return "success";
    }
}
