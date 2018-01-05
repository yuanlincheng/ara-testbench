package com.aratek.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * author: tree
 * version: 1.0
 * date: 2018/1/3 11:50
 * description: xxx
 * own: Aratek
 */
@Aspect
@Component
public class TimeAspect {

    private static Logger log = LoggerFactory.getLogger(TimeAspect.class);

    @Around("execution(* com.aratek.controller.HelloWorldController..*(..))")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {

        log.info("=====Aspect处理=======");
        Object[] args = pjp.getArgs();
        for (Object arg : args) {
            log.info("参数为: {}",arg);
        }

        long start = System.currentTimeMillis();

        Object object = pjp.proceed();

        log.info("Aspect 耗时: {}",System.currentTimeMillis() - start);

        return object;
    }
}
