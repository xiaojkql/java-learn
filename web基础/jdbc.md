JDBC Java DataBase Connectivity
功能：用于执行SQL语句的Java API,是Java语言的访问数据库的标准规范
组成：由Java编写的类和接口
使用形式：使用JDBC编写通用的应用程序，连接每个数据库的驱动(对JDBC的实现)对数据库进行访问

## 2 JDBC的体系结构
三层结构：两边API,分别供程序员和数据库厂商使用，中间是连接两个接口的连接器
JDBC API
JDBC Driver Manager
JDBC Driver API

## 3 JDBC URL
标识数据库的方法，可以使JDBC程序识别指定的数据并与之建立连接
jdbc:mysql:[] //localhost:3306 /test 参数
协议 子协议(数据库)  主机  端口  数据库 参数=
