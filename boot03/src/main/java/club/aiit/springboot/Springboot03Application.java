package club.aiit.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextListener;
import java.util.Arrays;


@SpringBootApplication
public class Springboot03Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03Application.class, args);
    }

    //servlet注册
    @Bean
    public ServletRegistrationBean getTestServlet() {
        ServletRegistrationBean<TestServlet> registrationBean = new ServletRegistrationBean<>(new TestServlet(), "/tservlet");
        return registrationBean;
    }

    //过滤器注册
    @Bean
    public FilterRegistrationBean getTestFilter() {
        FilterRegistrationBean<TestFileter> filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new TestFileter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello"));
        return filterRegistrationBean;
    }

    //监听器注册
    @Bean
    public ServletListenerRegistrationBean getTestListener() {
        ServletListenerRegistrationBean<TestListener> servletContextListener = new ServletListenerRegistrationBean(new TestListener());
        return servletContextListener;
    }
}
