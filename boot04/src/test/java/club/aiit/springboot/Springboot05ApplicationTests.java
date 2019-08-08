package club.aiit.springboot;

import club.aiit.springboot.dao.UserMapper;
import club.aiit.springboot.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot05ApplicationTests {

    /*@Autowired
    DataSource dataSource;*/
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        //System.out.print(dataSource);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM y_user");
        System.out.print(maps);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setId(2);
        user.setCode("zxc");
        user.setName("张三");
        user.setPassword("123");
        System.out.print(userMapper.insert(user));
    }

    @Test
    public void query() {
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    public void queryList() {
        List<User> select = userMapper.select();
        System.out.println(select);
    }

    @Test
    public void delete() {
        System.out.println(userMapper.delete(2));
    }
}
