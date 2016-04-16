package com.jiangjg.springstudy.hibernate;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by root on 16-4-10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans-hibernate.xml")
public class SpringHibernateTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    SessionFactory sessionFactory;
    @Test
    public void testDataSource(){
        try {
            System.out.println(dataSource.getConnection());
            System.out.println(sessionFactory);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
