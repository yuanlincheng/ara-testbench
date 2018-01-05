package com.aratek.controller;

import com.aratek.configuration.MessageConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;


/**
 * author: tree
 * version: 1.0
 * date: 2018/1/2 16:25
 * description: xxx
 * own: Aratek
 */
//@RestController
@Controller
public class HelloWorldController {

//    @GetMapping("/")
//    @ResponseBody
//    public String hello() {
//        // 模拟异常
//        int i = 1/0;
//        return "Hello World abcdsfdjkjksd" + MessageConfiguration.getMsg("message.test");
//    }

    @GetMapping("/setLocal")
    @ResponseBody
    public String setLocal() {
        Locale locale = Locale.ENGLISH;
        MessageConfiguration.changeLocal(locale);
        return "Local设置成功";
    }
}
