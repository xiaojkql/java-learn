1 基于setter的DI设置实例的依赖项

## 1 面向接口编程的设计方法
一个类依赖于由其依赖项所实现的接口的应用程序设计
使得依赖类与其依赖项之间松耦合
依赖项类实现的接口称为依赖接口

面向类编程，面向接口编程
提高依赖类的可测试性

## 2 使用静态和实例工厂方法创建Spring Bean
使用Spring 来管理由工厂创建的对象实例
会在启动spring时就创建相应的实例

- 通过静态工厂方法实例bean
  启动spring直接创建相应的实例
   不会实例化工厂类，仅仅调用它的静态方法

- 通过实例工厂方法实例化bean
    先创建工厂的实例，然后再创建相应的实例
    必须定义一个public的构造函数
    会创建一个工厂的实例

如何设置由静态和实例工厂方法创建bean的依赖项
- 通过setBean来注入相应的依赖项 property来进行设置 property传递的参数是给目标实例化
- 可以作为工厂方法传递给对象的构造方法  contructor-arg 传递的参数是给factory


## 3 基于构造函数的DI
Spring中依赖注入是通过将参数传递给bean的构造函数和setter方法来实现
<constructor-arg index=   ref=  />


## 4 将配置详细信息传递给bean
通过value传递具体的值
<property name=  value=   />
<constructor-arg  index=  value=  />

只是Spring创建bean并注入相应的依赖项

## 5 bean的作用域
由<bean>元素的scope属性来指定

web中的范围:
request   session   websocket   application  globalsession决定了bean的生命周期

singleton实例
spring在启动时进行创建实例在关闭时销毁，且只创建一个这样的实例
Spring会为每个bean定义创建一个相应的实例

## 6 对一个singleton范围的对象进行延迟初始化
<lazy-init=true>
<beans>元素的<default-lazy-init>设置全局初始化是否延迟

prototype范围的bean总是会延迟初始化

