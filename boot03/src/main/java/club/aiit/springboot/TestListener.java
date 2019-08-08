package club.aiit.springboot;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.print("web容器的监听器启动了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.print("监听关闭");
    }
}
