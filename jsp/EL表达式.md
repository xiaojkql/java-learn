JSP要使用JAVA代码要么使用<%= %>或者<% %>形式
为了便于开发减少编码工作量
这种表达式能够简化JSP页面中访问数据的代码

EL 一种简单的数据访问语言
能够取代JSP表达式以及部分JSP脚本片段

语法
${表达式}

作用
获取数据
替换JSP页面中的脚本表达式，从各种类型的容器对象中检索java对象，获取数据

执行计算

获取Web开发常用对象 
EL表达式定义了一些隐含对象，通过这些隐含对象可以获得对JSP内置对象的引用，进而获得JSP内置对象中的数据

调用Java方法
定义EL函数，通过EL函数可以调用Java类的方法


### EL语法
### EL中的常量
布尔常量
整型常量
浮点数常量
字符串常量
Null常量

### EL中的变量
在没有预先定义的情况下即可直接使用
自动在page  request  session  application中进行查找

### EL中的操作符
EL提供了两种用于访问数据的操作符

.操作符
[]运算符

### EL中的运算符


## EL的隐含对象
可以直接使用的隐含对象
- pageContext
- pageScope
- requestScope
- sessionScope
- applicationScope
- param = requset.getParameter()
- paramValues
- header
- headerValues
- cookie
- initParam

cookie的使用
cookie.key
cookie.key.name
cookie.key.value


