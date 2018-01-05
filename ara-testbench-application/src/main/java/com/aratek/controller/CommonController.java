package com.aratek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author: tree
 * version: 1.0
 * date: 2018/1/3 17:29
 * description: xxx
 * own: Aratek
 */
@Controller
public class CommonController {

    /**
     * 进入系统首页
     * @param
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "main";
    }

    /**
     * 进入指定图片库捞取页面
     * @param
     * @return
     */
    @GetMapping("/common/toMakeImage")
    public String toMakeImage() {
        return "common/makeImage";
    }
}
