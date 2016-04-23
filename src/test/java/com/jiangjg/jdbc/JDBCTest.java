package com.jiangjg.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by root on 16-4-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:jdbc/jdbc-beans-jdbc.xml")
public class JDBCTest {


    @Autowired
    DriverManager driverManager;


    /*
    ResultSetMetaData:描述ResultSet的元数据对象，得到结果集中的列以及列名

     */
    @Test
    public void testResultSetMetaData(){

    }

    /*
    ResultSet: 封装了jdbc查询的结果
    1. 调用Statement的executeQuery(sql)可以得到结果集
    2. ResultSet返回的就是一张数据表
    3.也需要关闭
     */
    @Test
    public void testResultSet() throws SQLException {
        String jdbcUrl = "jdbc:mysql:///springstudy";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

        String sql = "select id as iii from  student";

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int i = resultSetMetaData.getColumnCount();
        String s = resultSetMetaData.getColumnLabel(1);
        String s2 = resultSetMetaData.getColumnName(1);
        System.out.println(i);
        System.out.println(s);
        System.out.println(s2);
        /*
        System.out.println(resultSet);
        while (resultSet.next()){
            System.out.println(resultSet.getObject(1));
            System.out.println(resultSet.getObject(2));
            System.out.println(resultSet.getObject(3));
        }
        */


        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void testPreparedStatement() throws Exception {
        String driverClass = "";
        String jdbcUrl = "";
        String user = "";
        String password = "";

        //读取类路径下的properties文件
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("jdbc/jdbc-jdbc.properties");

        Properties properties = new Properties();
        properties.load(inputStream);

        driverClass = properties.getProperty("jdbc.driverClass");
        jdbcUrl = properties.getProperty("jdbc.jdbcUrl");
        user = properties.getProperty("jdbc.user");
        password = properties.getProperty("jdbc.password");

        Driver driver = (Driver) Class.forName(driverClass).newInstance();
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);
        Connection connection = driver.connect(jdbcUrl, info);


        String sql = "insert into t_student(t_name, t_sex)" +
                 " VALUES(?,1)";
        System.out.println(sql);

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, "44444");
        //preparedStatement.setObject(2, 1);


        preparedStatement.execute();

        preparedStatement.close();
        connection.close();


        System.out.println(connection);
    }

    @Test
    public void testStatement() throws SQLException {
        /*
        1. 获取数据库链接
        2.准备插入的sql语句
        3.执行插入
            3.1 获取操作sql语句的Statement
            3.2调用statement的executeUpdate(sql)执行插入
         4. 关闭Statement对象
         5. 关闭数据库连接
         */
        String jdbcUrl = "jdbc:mysql:///springstudy";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);

        String sql = "insert into student (name,sex) values ('jiangjg',0)";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
        connection.close();
    }

    /*

     */
    @Test
    public void testDriverManager() throws SQLException {
        System.out.println(driverManager);
        String jdbcUrl = "jdbc:mysql:///springstudy";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
        System.out.println(connection);
    }
    /*
    Drvier是一个接口:  数据库厂商必须实现的接口, 用于获取数据库链接
     */
    @Test
    public void testDriver() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();
        String url = "jdbc:mysql:///springstudy";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "123456");
        Connection connection = driver.connect(url, properties);
        System.out.println(connection);
    }
    /*
    编写一个通用的方法, 不修改源程序的情况下，可以获取任何数据库的连接
    解决方案：把数据库驱动Driver实现类的全类名，放到配置文件中
     */
    @Test
    public void getConnection() throws Exception {
        String driverClass = "com.mysql.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql:///springstudy";
        String user = "root";
        String password = "123456";

        //读取类路径下的properties文件

        /*
        读不到  以后解决
         */

        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("jdbc/jdbc-jdbc.properties");

        System.out.println(inputStream);
         /*
        Properties properties = new Properties();
        properties.load(inputStream);

        driverClass = properties.getProperty("jdbc.driverClass");
        jdbcUrl = properties.getProperty("jdbc.jdbcUrl");
        user = properties.getProperty("jdbc.user");
        password = properties.getProperty("jdbc.password");
        */

        Driver driver = (Driver) Class.forName(driverClass).newInstance();
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);
        Connection connection = driver.connect(jdbcUrl, info);
        System.out.println(connection);


    }
}
