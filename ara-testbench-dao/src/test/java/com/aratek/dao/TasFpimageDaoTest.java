/**
 * author: tree
 * version: 1.0
 * date: 2018/01/12
 * description:
 * own: Aratek
 */

package com.aratek.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.extern.slf4j.Slf4j;

import com.aratek.DaoApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DaoApplication.class)
@Slf4j
public class TasFpimageDaoTest {

    @Autowired
    private TasFpimageDao tasFpimageDao;


}