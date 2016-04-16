package com.jiangjg.springstudy.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 16-4-4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/beans-jdbc.xml")
public class JDBCTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    ApplicationContext context;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /*
    使用据名参数时，可以namedParameterJdbcTemplate.update(sql, parameterSource);
     */
    @Test
    public void testNamedParameterJdbcTemplate2(){
        String sql = "insert into student(name, sex) values(:name, :sex)";

        Student student = new Student();
        student.setName("wwww");
        student.setSex(1);
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(student);
        namedParameterJdbcTemplate.update(sql, parameterSource);
    }

    /*
    可以为参数起名字，便于维护
    缺点：较为麻烦
     */
    @Test
    public void testNamedParameterJdbcTemplate(){
        String sql = "insert into student(name, sex) values(:name, :sex)";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "jjjjjj");
        map.put("sex", 1);
        namedParameterJdbcTemplate.update(sql, map);
    }

    @Test
    public void testDataSource(){
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /*
    不支持级联映射, 仅仅是jdbc的工具，而不是ORM框架
     */
    @Test
    public void testQueryForObject(){
        String sql = "select id,name,sex from student where id = ?";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        Student student = jdbcTemplate.queryForObject(sql, rowMapper, 1);
        System.out.println(student);
    }

    @Test
    public void testUpdate(){
        String sql = "UPDATE student SET name = ? where id = ?";
        jdbcTemplate.update(sql, "mmm", 1);
    }

}
