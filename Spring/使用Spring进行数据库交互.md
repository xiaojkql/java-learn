Spring通过在JDBC之上提供一层抽象来简化与数据库的交互
简化了用于与数据库交互的ORM(对象关系映射)框架的使用
Spring JDBC抽象
Spring对程序化和声明式事务的支持


Spring JDBC模块通过处理开放和关闭连接的低层细节、管理事务、处理异常等工作来简化与数据源的交互

## 使用Spring JDBC
配置数据源，使用dbcp数据源
dataSource bean表示一个javax.sql.DataSource对象扮演了创建与数据源连接工厂角色
jee模式的<jndi-lookup>元素来获取JNDI绑定的数据源

jdbcTemplate线程安全

## 使用Spring模块开发ORM
Spring的ORM模块提供与Hibernate  Java Persistence API (JPA) 和 java数据对象JDO的集成

## 使用Spring的事务管理
支持编程式事务和声明式事务
编程式事务: Spring的事务管理抽象用于显示启动、结束和提交事务。将应用程序代码与Spring特定的类相耦合
声明式事务:Spring的@Transactional注解来注解在事务中执行的方法

通过使用Transaction Template类或者使用Spring的PlatformTransactionManaget接口实现
Transaction Template类通过处理启动和提交事务来简化事务管理

声明式事务管理
通过注解@Transaction来标明某个类的方法或者某个类的所有方法都需要在事务中执行


## Spring对JTA的支持
JTA：java transaction Api

