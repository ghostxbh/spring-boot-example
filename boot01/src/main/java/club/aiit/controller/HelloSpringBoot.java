package club.aiit.controller;

import club.aiit.model.Person;
import club.aiit.utils.UploadFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

@Controller
public class HelloSpringBoot {

    @RequestMapping(value="/hello1")
    public String gotoHello(){
        return "Hello_Spring_Boot";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "success";
    }
    @RequestMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam("pic") MultipartFile file, HttpServletRequest request){
        //自己定义本机地址作为文件储存
        String filePath="D:/upload/";
        String filename = file.getOriginalFilename();
        try {
            UploadFile.getUpload(file.getBytes(),filePath,filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }

    @RequestMapping("/person")
    @ResponseBody
    public Person getJson() {
        Person p = new Person();
        p.setAge(18);
        p.setName("小明");
        return p;
    }
}
