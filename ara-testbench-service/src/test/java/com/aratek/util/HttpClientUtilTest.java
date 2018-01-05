package com.aratek.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/5 21:07
 * @description: xxx
 * own: Aratek
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HttpClientUtil.class)
@Slf4j
public class HttpClientUtilTest {

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Test
    public void wsAfisLogin() throws Exception {
        log.info(httpClientUtil.wsAfisLogin("abc","sdfsdf").toString());
        Assert.assertNotNull(httpClientUtil.wsAfisLogin("abc","sdfsdf"));
    }

}