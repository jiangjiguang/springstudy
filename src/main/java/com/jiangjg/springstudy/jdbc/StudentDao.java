package com.jiangjg.springstudy.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 16-4-9.
 */
@Repository
public class StudentDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Student get(int id){
        String sql = "select id,name,sex from student where id = ?";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        Student student = jdbcTemplate.queryForObject(sql, rowMapper, 1);
        return student;
    }
}
