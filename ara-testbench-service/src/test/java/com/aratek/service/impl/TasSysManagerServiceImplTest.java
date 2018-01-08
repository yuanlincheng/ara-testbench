package com.aratek.service.impl;

import com.aratek.ServiceApplication;
import com.aratek.service.TasSysManagerService;
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
 * date: 2018/1/6 21:31
 * @description: xxx
 * own: Aratek
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
@Slf4j
public class TasSysManagerServiceImplTest {

    @Autowired
    private TasSysManagerService tasSysManagerService;

    @Test
    public void findAll() throws Exception {
        Assert.assertNotNull(tasSysManagerService.findAll());
    }

}