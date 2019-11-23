开发基于servlet的Web应用程序的MVC(MODEL  VIEW  CONTROLLER)
非侵入式框架
清晰地分离构成web层的应用程序对象之间的关系
控制器对象处理请求
验证器对象来执行验证
命令对象来存储表单数据

## 1 文件结构
Web应用程序上下文XML文件 子Web应用程序上下文XML文件 定义构成Web层的bean，通常定义了控制器(处理器)，处理程序映射，视图解析器和异常解析器
Web应用程序部署描述符
根web应用程序上下文XML文件


## 2 网络应用程序
控制器
实现Controller接口
定义了一个handleRequest方法，实现该方法来提供请求处理逻辑

SimpleUrlHandlerMapping
InternalResourceViewResolver


## 3 DispatcherServlet 前端控制器
初始化时DispatherServlet负责加载相应的Web应用程序上下文XML文件
创建一个WebApplicationContext对象的实例是ApplicationContext的子接口
提供了web应用程序特有的功能
表示Spring容器的实例


访问ServletContext和ServletConfig对象
