package com.aratek.configuration;

import com.aratek.exception.InternalSystemException;
import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * author: tree
 * version: 1.0
 * date: 2018/1/3 12:07
 * description: xxx
 * own: Aratek
 */
@ControllerAdvice
public class GlobalExceptionConfiguration {

    private static Logger log = LoggerFactory.getLogger(GlobalExceptionConfiguration.class);

    /**
     * 处理 Exception 类型的异常
     * @param ex
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> defaultExceptionHandler(Exception ex) {
        Map<String,Object> responseMap = new HashMap<String,Object>();
        boolean showStackFlag = true;
        responseMap.put("anyStatus", 0);
        if (ex instanceof InternalSystemException || ex instanceof ServiceException) {
            log.error("系统警告信息: "+ex.getMessage());
            responseMap.put("msg", "系统警告信息：" + ex.getMessage());
            showStackFlag = false;
        } else if (ex instanceof NullPointerException) {
            responseMap.put("msg", "此次操作出现空指针异常!");
        } else {
            responseMap.put("msg", ex.getMessage());
        }
        if (showStackFlag) {
            ex.printStackTrace();
        }
        responseMap.put("data", null);
        return responseMap;
    }
}
