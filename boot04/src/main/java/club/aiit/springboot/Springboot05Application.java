package club.aiit.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("club.aiit.springboot.dao")
@SpringBootApplication
public class Springboot05Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot05Application.class, args);
	}
}
