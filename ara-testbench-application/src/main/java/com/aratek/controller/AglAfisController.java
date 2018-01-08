package com.aratek.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: tree
 * version: 1.0
 * date: 2018/1/4 10:01
 * description: xxx
 * own: Aratek
 */
@Controller
@RequestMapping("/aglAfis")
@Slf4j
public class AglAfisController {

    /**
     *  进入安哥拉十指指纹注册页面
     * @param
     * @return
     */
    @GetMapping("/toEnrollAgl")
    public String toEnrollAgl() {
        return "agl/enrollAgl";
    }

    /**
     *  进入指纹注销页面
     * @param
     * @return
     */
    @GetMapping("/toDeletePerson")
    public String toDeletePerson() {
        return "agl/deletePersonAgl";
    }

    /**
     *  采集人数据注销接口
     * @param
     * @return
     *//*
    @GetMapping("/deletePerson")
    @ResponseBody
    public Map<String, Object> deletePerson(String sessionId, String eid) {
        log.debug("证件号注销[AGL]");
        Map<String,Object> responseMap = new HashMap<String,Object>();
        try {
            ResponseWsVO rv = HttpClientUtil.wsAfisDelete(sessionId, eid);
            if (rv.getResultCode() == 0) {
                anyStatus = 1;
                msg = "采集人数据注销服务申请成功，注销的证件号为：" + eid;
            } else {
                msg = "采集人数据注销服务申请失败，错误原因为：" + rv.getResultMsg();
            }
        } catch (Exception e) {
            msg = "抱歉，服务器异常";
        }
        responseMap.put("anyStatus", anyStatus);
        responseMap.put("msg", msg);
        return responseMap;
    }*/
}
