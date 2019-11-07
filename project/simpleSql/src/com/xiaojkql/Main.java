package com.xiaojkql;

import java.sql.*;

/**
 * @author qinyuan
 * @date 2019-10-31-上午9:23
 */
public class SimpleSql {

    public void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动程序
        Class.forName("com.mysql.jdbc.Driver");

        // 获得与数据库的连接
        String url = "jdbc:mysql://localhost:3306/simple_sql";
        String userName = "root";
        String password = "qy";
        Connection connection = DriverManager.getConnection(url,userName,password);

        // 获得操作数据库的类函数
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM player";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println("id  name  age  position");
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String age = resultSet.getString(3);
            String position = resultSet.getString(4);
            System.out.printf(id+" "+name+" "+age+" "+position);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}