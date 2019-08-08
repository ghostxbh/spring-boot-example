package com.uzykj;

import com.uzykj.jooq.pojo.User;
import com.uzykj.jooq.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GraphqlApplicationTests {

	@Autowired
	UserService service;
	@Test
	public void contextLoads() {

	}

}

