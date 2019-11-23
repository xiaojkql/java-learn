Spring容器使用应用程序上下文XML文件中包含的bean定义作为创建bean实例的蓝图
指定了
- bean的依赖项
- bean的初始化
- bean的销毁方法
- bean实例的延迟或即刻初始化策略
- bean的作用范围

## 1 用@component表示Spring bean
是一个类型级注释标识表示一个Spring bean的类
@controller注释控制器
@Service注释服务
@Repository注释Dao

## 2 @Autowired通过类型自动装配依赖项
@Autowired在构造函数级，方法级，字段级使用
当使用@Autowired进行注释时，Spring将会使用AutowiredAnnotationBeanPostProcessor负责自动装配相应的字段
使用Autowired注释的字段不需要一定是共有的或具有相应的共有setter方法

## 3 @Qualifier按名称自动装配依赖项
@Qualifier可以在字段级，方法参数级和构造函数 参数级来按名称自动装配依赖项

使用qualifiers自动装配bean
qualifier是使用@Qualifier注释与bean关联的字符串值，不再使用bean的id而是使用qualifier来完成自动装配

创建自定义限定符注释
不使用简单的限定符值和bean名称，可以创建自定义的限定符注释，在这种注释中可以定义基于过滤自动装配候选项的特性


## 4 JSR 330的@Inject和@Named注释
Java的依赖注入
Java平台依赖的标准化
@Inject和@Named注入的方式

## 5 JSR 250的@Resource注释
支持按字段和setter方法的名称自动装配

## 6 @Scope  @Lazy  @DependsOn  @Primary

延迟自动装配依赖项
@Autowired和@Lazy联合使用  能起到延迟装配singleton和prototype的依赖项，且每次都会创建一个新的prototype对象

使用@DependsOn注释指定隐式bean依赖项


## 7 使用@Value简化注释的bean类的配置
@Value注释  可以用在字段级  方法级 方法参数级 构造参数级
@Value(value="zhi")  @Value("zhi")

可以使用spring表达式语言(SpEL)取代字符床值来指定@Value注释的value特性值
可以在运行时查询和操作对象
从其他bean中获取配置信息

在方法级和方法参数级使用@Value注释
只有使用了@Autowired 或 @Resource 或 @Inject的注释时，才可以使用@Value注释

在SpEL中使用数学，关系和逻辑运算符


使用SpEL获取bean的引用  完成依赖注入的功能

在SpEL中使用正则表达式

在SpEL中使用映射和列表

在基于XML的bean定义中指定SpEL表达式



## 8 使用Spring的Validator接口验证对象
**为什么要使用此接口来进行验证呢？ 不能直接进行验证吗？这有什么好处**
是Spring Validation API的一部分，允许执行对象的验证，可以使用Validator接口来执行任何应用程序层中对象的验证
BeanPropertyBindingResult  对Errors的默认实现
Spring的Validator接口通常用于基于Spring MVC的Web应用层，同时将HTML表单中用户输入的信息绑定到相应的表单支持对象


## 9 使用JSR 349注释指定约束
JSR 349 (Bean Validation API 1.1)允许使用注释来指定JavaBeans组件的约束
用法：用注释进行写我们要求的约束，然后在程序中用一个validator来进行验证，是否满足约束

验证方法：验证方法的参数和返回值

## 10 bean定义配置文件
允许将一组bean与配置文件相关联
**希望在不同环境中使用不同的bean集合时，通常将bean与配置文件相关联**

使用<beans>元素的profile特性
通过系统来配置你的开发环境，然后spring根据设置的开发环境来选择具体创建哪一个bean
