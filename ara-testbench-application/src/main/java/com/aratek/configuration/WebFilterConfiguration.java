package com.aratek.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * author: tree
 * version: 1.0
 * date: 2018/1/2 17:43
 * description:  自定义Filter 用于录调用日志、排除有XSS威胁的字符、执行权限验证等等
 * own: Aratek
 */
@Configuration
@Slf4j
public class WebFilterConfiguration {

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        //注册到过滤器链中
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new MyFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("MyFilter");
        registration.setOrder(1);
        return registration;
    }

    public class MyFilter implements Filter {
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {
            log.info("=======初始化过滤器=========");
        }
        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
                throws IOException, ServletException {
            long start = System.currentTimeMillis();
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            String url = request.getRequestURI();
            filterChain.doFilter(servletRequest,servletResponse);
            if(!url.contains("/druid/")){
                log.info("请求地址: {}", request.getRequestURI());
                log.info("请求耗时统计: {}", System.currentTimeMillis() - start);
            }
        }
        @Override
        public void destroy() {
            log.info("=======销毁过滤器=========");
        }
    }
}
