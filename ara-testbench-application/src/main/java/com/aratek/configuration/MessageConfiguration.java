package com.aratek.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/2 21:11
 * @description: 通用的国际化配置
 * own: Aratek
 */
@Component
@Slf4j
public class MessageConfiguration {

    private static Locale locale = LocaleContextHolder.getLocale();

    private static MessageSource messageSource;

    public static String getMsg(String key) {
        return messageSource.getMessage(key, null, locale);
    }

//    public static String getMsg(String key,Locale locale) {
//        return messageSource.getMessage(key, null, locale);
//    }

    public static String getMsg(String key, String... arg) {
        Object[] args = new Object[arg.length];
        for (int i = 0; i < arg.length; i++) {
            args[i] = arg[i];
        }
        return messageSource.getMessage(key, args, locale);
    }

    public static void changeLocal(Locale locale) {
        locale = locale;
    }

    @Autowired(required = true)
    public void setMessageSource(MessageSource messageSource) {
        MessageConfiguration.messageSource = messageSource;
    }
}
