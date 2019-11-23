之前: 应用应用程序上下文XML文件或使用Java注释来配置Spring容器
当前：如何以编程方式配置Spring容器
用编程的方式配置bean和Spring容器
即创建一个类来手动的new 一个对象，这个new对象是受到spring容器管理的

## 1 使用@Configuration 和 @Bean注释配置bean


## 2 注入bean依赖项

## 3 配置Spring容器
创建一个AnnotationConfigApplicationContext类来表示ApplicationContext

编程方式配置AnnotationConfigApplicationContext实例 使用no-args的构造函数
然后调用register方法来注册相关的Configuration和由beans方法的类

## 4 生命周期回调
@PostConstruct
@PreDestroy
注解标识了一个bean初始化和销毁方法

实现了一些接口将会被Spring容器回调

## 5 导入基于Java的配置
模块化应用程序
使用多个@Configuration文件中定义bean
组合多个@Configuration使用@Import注释  等同于<import>元素

解决依赖关系：在不同Configuration类中定义的bean之间有着依赖关系

## 6 附加主题
