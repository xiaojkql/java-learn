## 1 登录页面
重定向会改变地址栏，但是转发不会改变地址栏

interceptor 排除首页的拦截
重定向的问题(防止表单重复提交，重定向有一个转发参数的变量)

response.sendRedirect(request.getContextPath()+uri)  uri是相对于web-app的路径  contextPath就相对于webapp文件夹
WEB-INF外的文件都是可以重定向的，但是WEB-INF内的必须通过一个servlet来进行访问, 且可以直接访问uri来进行访问获取。在使用SpringMVC的时候就是通过DispatchServlet来进行映射的
response.sendRedirect(request.getContextPath()+"/login/noAuth");
response.sendRedirect(request.getContextPath()+"index.jsp");

重定向传递参数: 
1. 使用地址栏： ？para=value  model中的参数会自动写到后面 手动形式
2. 同样是地址栏，接收端使用 /{param1}/{param2}  param1 param2   转发端使用一个明确的字符值进行直接写值 rest风格
3. 使用RedirectAttributes  并调用方法addFlashAttribute添加我们需要传递的参数  能传递各种对象 且自动放在了model中
4. 地址栏 转发端用{param} 此时要将key-value添加进addAttribute 中 会自动提取，没有提取的会在后面用?param=value的形式进行请求

重定向地址要写全 哪怕是在同一个controller中

转发


## 2 form传参问题
text没写就提交式空字符串
@RequestParam注解时要求参数必须不为空

## 3 PageHelper的使用


## 4 Ajax的使用

SpringMVC 的
@RequestBody
@RequestParam
@PathVariable
