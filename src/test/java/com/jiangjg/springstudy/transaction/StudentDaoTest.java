package com.jiangjg.springstudy.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by root on 16-4-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans-transaction.xml")
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private StudentService studentService;


    @Test
    public void testStudentService2(){
        studentService.changeName2("wwww", "exception2");
    }


    /*
    @Test
    public void testStudentService(){
        studentService.changeName("wwww", "exception2");
    }

    @Test
    public void testStudentDao(){
        System.out.println(studentDao);

        //System.out.println(studentDao.getSexByName("mmm"));

        studentDao.updateNameBySex(0, "exception3");
    }
    */


}
