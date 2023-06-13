package com.paul.demo.service;

import java.sql.*;

/**
 * Date: 2023-06-13 22:33
 * Author: Paul
 */
public class MyJDBC {

    public static void main(String[] args) throws Exception {
        getConnectJDBC();
    }

    //定义数据连接配置
    private static final String url = "jdbc:mysql://192.168.1.110:3306/test";
    private static final String user = "fyj@163.com";
    private static final String password = "123456";

    /**
     * 获取数据库连接demo
     *
     * @author Paul
     **/
    public static void getConnectJDBC() throws Exception {
        //要执行的SQL语句
        String sql = "SELECT * FROM GOODS WHERE PRODUCT_NAME LIKE '%农夫山泉%' ";
        //1.加载驱动（使用Class.forName 方法）
        Class.forName("com.mysql.jdbc.Driver");
        //2.打开数据库连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.执行SQL语句
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        //4.处理结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("PRODUCT_NAME"));
        }
        //5.关闭连接
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e + "");
        }
    }

    /**
     * Java SPI机制出现后的实现方式
     *
     * @author Paul
     **/
    public void getConnBySPI() throws Exception {
        //要执行的SQL语句
        String sql = "SELECT * FROM GOODS WHERE PRODUCT_NAME LIKE '%农夫山泉%' ";
        //1.引入数据库驱动 JAR 包（例如：mysql-connector-java.jar）
        //2.打开数据库连接
        Connection connection = DriverManager.getConnection(url, user, password);
        //3.执行SQL语句
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        //4.处理结果集
        while (resultSet.next()) {
            System.out.println(resultSet.getString("PRODUCT_NAME"));
        }
        //5.关闭连接
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception(e + "");
        }
    }

}
