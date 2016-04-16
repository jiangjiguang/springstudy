package com.jiangjg.springstudy.annotation.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by root on 16-4-4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/beans-annotation.xml")
public class UserServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    ApplicationContext ctx;

    @Autowired
    UserService userService;

    @Test
    public void testUserService(){
        userService.add();
    }

    @Test
    public void testGetName(){
        assertEquals("UserService", userService.getName());
    }



}
