1 Java中传递代码块，必须先定义一个对象，然后在对象种实现相应的方法

```java
public class Lambda
{

}
```

1 替换函数式接口
函数式接口 --> 一些类的抽象方法
java.util.function包中有很多通用的函数式接口
java中有很多封装代码块的接口
只有一个抽象方法的接口可以用lambda表达式来定义该接口，称之为函数式接口

2 方法引用等价于lambda表达式
System.out::println == (x)->System.out.println(x)
Math::pow == (x,y)->Math.pow(x,y)

3 构造器引用
Person::new

4 变量作用域
lambda访问外围的变量
只能引用值不会发生变化的变量
lambda捕获的变量必须式最终的变量(final

5 生成lambda表达式并将之传递到需要函数接口的地方

6 处理lambda表达式
lambda的作用: 延迟执行
