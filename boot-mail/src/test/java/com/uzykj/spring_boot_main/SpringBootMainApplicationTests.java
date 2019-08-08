package com.uzykj.spring_boot_main;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringBootMainApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) throws IOException {
        String filePath = "/Users/xubenhao/Documents/one.txt";
        FileSystemResource file = new FileSystemResource(new File(filePath));
        String fileName = file.getFile().getName();
        log.info(fileName);
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(filePath));
        //一次性取多少字节
        byte[] bytes = new byte[2048];
        //接受读取的内容(n就代表的相关数据，只不过是数字的形式)
        int n = -1;
        //循环取出数据
        String str = null;
        while ((n = in.read(bytes,0,bytes.length)) != -1) {
            //转换成字符串
            str += new String(bytes,0,n,"GBK");

        }
        log.info(str);
        //关闭流
        in.close();
    }
}
