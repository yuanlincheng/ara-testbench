/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;

import com.aratek.ServiceApplication;
import com.aratek.service.TasX2nIdentifyResultService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
@Slf4j
public class TasX2nIdentifyResultServiceImplTest {

    @Autowired
    private TasX2nIdentifyResultService tasX2nIdentifyResultService;

    @Test
    public void save()throws Exception{

    }

    @Test
    public void update()throws Exception{

    }

    @Test
    public void delete()throws Exception{

    }

    @Test
    public void findAll()throws Exception{
//        tasX2nIdentifyResultService.findAll().stream().forEach( x ->{
//            log.info(x.get);
//        });
        Assert.assertNotNull(tasX2nIdentifyResultService.findAll());
    }

    @Test
    public void findOne()throws Exception{
//        String id =
//        Assert.assertNotNull(tasX2nIdentifyResultService.findOne(id));
    }

    @Test
    public void findByParam()throws Exception{

    }
}