package com.jiangjg.springstudy.transaction;

import com.jiangjg.springstudy.jdbc.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 16-4-10.
 */
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getSexByName(String name) {
        //String sql = "select id,name,sex from student where id = ?";
        //RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        String sql = "select sex from student where id = ?";
       return jdbcTemplate.queryForObject(sql, Integer.class, 1);
    }

    public void updateNameBySex(int sex, String name) {
        //检查设置的名字, 若是exception  则抛出异常

        if(name.equals("exception")){
            throw new MyException("failed");
        }
        String sql = "UPDATE student SET name = ? where sex = ?";
        jdbcTemplate.update(sql, name, sex);
    }
}
