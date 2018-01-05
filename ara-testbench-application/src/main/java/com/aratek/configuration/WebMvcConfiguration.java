package com.aratek.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * author: tree
 * version: 1.0
 * date: 2018/1/2 17:43
 * description:  //自定义拦截器
 * own: Aratek
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

    private static Logger log = LoggerFactory.getLogger(WebMvcConfiguration.class);

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册到拦截器链中
        registry.addInterceptor(new TimeInterceptor());
//        registry.addInterceptor(localeChangeInterceptor());
    }

    public class TimeInterceptor implements HandlerInterceptor {

        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            log.info("MVC预处理：[{}][{}]",((HandlerMethod) handler).getBean().getClass().getName(),((HandlerMethod) handler).getMethod().getName());
            request.setAttribute("startTime", System.currentTimeMillis());
            return true;
        }

        @Override
        public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
                throws Exception {
            Long start = (Long) request.getAttribute("startTime");
            log.info("MVC业务处理耗时：[{}]",System.currentTimeMillis() - start);
        }

        @Override
        public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
                throws Exception {
            Long start = (Long) request.getAttribute("startTime");
            log.info("完成MVC处理耗时：[{}]",System.currentTimeMillis() - start);
        }

    }

//    @Bean //语言切换拦截器
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
//        lci.setParamName("lang");
//        return lci;
//    }
}
