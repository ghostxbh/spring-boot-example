package club.aiit.springboot;

import javax.servlet.*;
import java.io.IOException;

public class TestFileter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.print("前置通知");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.print("后置通知");
    }

    @Override
    public void destroy() {

    }
}
