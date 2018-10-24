# springmvc_mybatis

SpringMVC和Mybatis整合（前端控制器、处理器映射器、处理器适配器、视图解析器学习）


SpringMVC的工作原理

· 发起请求到前端控制器(DispatcherServlet)

· 前端控制器请求HandlerMapping查找 Handler。可以根据xml配置、注解进行查找

· 处理器映射器HandlerMapping向前端控制器返回Handler

· 前端控制器调用处理器适配器去执行Handler· 处理器适配器去执行Handler

· Handler执行完成给适配器返回ModelAndView

· 处理器适配器向前端控制器返回ModelAndView。ModelAndView是springmvc框架的一个底层对象，包括 Model和view

· 前端控制器请求视图解析器去进行视图解析。根据逻辑视图名解析成真正的视图(jsp)

· 视图解析器向前端控制器返回View

· 前端控制器进行视图渲染。视图渲染将模型数据(在ModelAndView对象中)填充到request域

· 前端控制器向用户响应结果

通过SpringMVC和Mybatis整合的一个入门程序，了解springmvc框架原理，对前端控制器、处理器映射器、处理器适配器、视图解析器学习。区别非注解的处理器映射器、处理器适配器与注解，的处理器映射器、处理器适配器（要求掌握）。在实际开发中建议使用后者注解开发，简化代码，降低程序维护难度。

