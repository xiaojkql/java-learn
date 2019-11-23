javax.servlet.http

### HttpServlet
覆盖了GenericServlet类
并覆盖了一个Service方法(方法参数不一样))
Tomacat容器调用原来的Service然后调用新的service然后调用
doGet  doPoset  doHead  doPut  doTrace  doOptions  doDelete 7个HTTP方法中的一个


### HttpServletRequest
在原来的ServletRequest的方法基础上增加了一些方法
获取请求行信息
- getContextPath()    ssm_war  http://localhost:3306/ssm_war/url
- getRequestURL  ssm_war/url  http://localhost:3306/ssm_war/url
- getServletPath()
- -getMethod()  获取是post,get等
- getQueryString()  获取url中?之后的信息

获取请求头信息
- getHeader()

获取请求体信息
- getReader()

获取请求参数
String getParameter(name)
String[] getParameterValues(name)
Enumeration getParameterNames()
Map getParameterMap()

作为存取数据的容器
- void setAttribute(name, value)
- Object getAttribute(String name)
- void removeAttribute(name)
- Enumeration getAttributeNames()

请求转发
getRequestDispather(path)
RequestDispatcher.forward(request, response)

- getCookies()
- getSession()
  

### HttpServletResponse

设置响应状态
setStatus(int sc)
sendError(int sc)
sendError(int sc, String message)

设置响应头信息

获取响应体消息

请求重定向
sendRedirect(path)
客户端的浏览器的url栏会改变，是客户端的重新向服务器发起请求
request失效


同样扩展了ServletResponse中的方法
- addCookie()
- addHeader()
- sendRedirect(location)

### Cookie


### HttpSession
