- bean定义的继承
- bean类的构造函数的参数
- 配置原始类型
- p命名空间c命名空间
- spring factory bean接口
- 模块化bean配置

## 1 bean定义的继承
如果应用程序中多个bean共享一组的公共配置(属性，构造函数参数等)则可以创建一个bean定义作为其他bean的父定义
继承了什么
- 属性
- 构造函数参数
- 方法覆盖
- 初始化和销毁方法
- 工厂方法

bean继承的要么是父bean的子类，要么实现了setter方法
<bean=id  abstract=true>
</bean>

## 2 构造函数参数匹配
将java简单类型值作为构造参数使用value
将springbean引用作为构造参数使用ref
spring容器匹配构造函数参数类型

### 基于类型的构造方法参数匹配
构造函数参数表示不同的Spring bean
构造函数参数的Spring bean与继承无关时，本质上是不同的
如果参数与继承关系有关则需要额外的西陵类似帮助解析构造函数参数
可以使用<constructor-arg>元素的index或者type属性来
指定type能消除构造函数参数与继承关系相关的歧义

(3)  构造函数表示标准Java类型和自定义类型
用type特性显示指定构造函数参数的类型

### 基于名称的构造函数参数匹配
使用名称必须要开启参数名称发现标志编译类
使用<construct-arg name=...>的name属性标定要赋值的属性名称
使用@constructorProperties清楚的注释构造参数

#### @constructorProperties注解和bean定义继承

#### @constructorProperties注解和工厂方法
<construct-arg>也用于将参数传递给静态或者实例工厂方法


## 3 配置不同类型的bean属性和构造函数参数
属性或者构造函数的取值:
- string类型
- 对另一个bean的引用
- 其他标准类型
- 自定义类型

Spring中内置的PropertyEditor实现

### Spring 的内置属性编辑器
将bean属性或构造函数参数的字符串转换为实际的java类型的属性或构造函数
可以通过为属性指定字符串类来将某个类配置为spring bean，并通过使用注册的JavaBeans propertyEditor实现使Pring
Spring容器使用注册的PropertyEditors将属性和构造函数参数的字符串值转换为相应的java类型
<property>的子元素  <property>的value属性

### 指定不同集合类型的值
<property> <constructor-arg>的子元素<list> <map><set>分别用于设置List,Map,Set的属性和构造方法参数
- 将List map set properties类型的元素添加到集合类型
- 将bean引用添加到集合类型
- 将bean名称添加到集合类型
- 将null值添加到集合类型

### 指定数组的值
<array>子元素

### 与<list> <set> <map>元素相对应的默认实现
可以使用Spring的util模式来指定自己想要的实现方式


## 4 内置属性编辑器
设置bean属性和构造函数参数时非常有用
CustomCollectionEditor
CustomMapEditor
CustomDateEditor


## 5 向Spring容器注册属性编辑器
- 创建实现Spring的propertyEditorRegister接口的类 该类负责向容器注册属性编辑器
- 将


## 6 具有p和c命名空间的简明bean定义
p 对应bean的属性
c 对应bean的构造函数参数
<bean id=   class=...   p:name=   p:name-ref=>

## 7 Spring 的util模式
提供了一种简洁的方式来执行常见的配置任务，以此来简化配置bean
将各种Java基本类型和标准类型用util来进行配置初始化，并暴露为一个bean，然后在后面就可以当成一个bean来使用了

## 8 FactoryBean接口
用来创建bean实例的工厂的类实现
要执行复杂的条件检查来决定要创建的bean类型以及执行复杂的bean初始化逻辑，factoryBean特别有用

## 9 模块化bean配置
