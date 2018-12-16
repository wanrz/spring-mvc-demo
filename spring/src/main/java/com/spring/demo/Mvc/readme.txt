Spring Web MVC 框架

MVC 框架教程
Spring web MVC 框架提供了模型-视图-控制的体系结构和可以用来开发灵活、松散耦合的 web 应用程序的组件。MVC 模式导致了
应用程序的不同方面(输入逻辑、业务逻辑和 UI 逻辑)的分离，同时提供了在这些元素之间的松散耦合。

模型封装了应用程序数据，并且通常它们由 POJO 组成。
视图主要用于呈现模型数据，并且通常它生成客户端的浏览器可以解释的 HTML 输出。
控制器主要用于处理用户请求，并且构建合适的模型并将其传递到视图呈现。

DispatcherServlet
Spring Web 模型-视图-控制（MVC）框架是围绕 DispatcherServlet 设计的，DispatcherServlet 用来处理所有的 HTTP
 请求和响应。Spring Web MVC DispatcherServlet 的请求处理的工作流程如下图所示：mvc1.png

下面是对应于 DispatcherServlet 传入 HTTP 请求的事件序列：
a.收到一个 HTTP 请求后，DispatcherServlet 根据 HandlerMapping 来选择并且调用适当的控制器。
b.控制器接受请求，并基于使用的 GET 或 POST 方法来调用适当的 service 方法。Service 方法将设置基于定义的业务逻辑的模型数
据，并返回视图名称到 DispatcherServlet 中。
c.DispatcherServlet 会从 ViewResolver 获取帮助，为请求检取定义视图。
一旦确定视图，DispatcherServlet 将把模型数据传递给视图，最后呈现在浏览器中。
上面所提到的所有组件，即 HandlerMapping、Controller 和 ViewResolver 是 WebApplicationContext 的一部分，而
 WebApplicationContext 是带有一些对 web 应用程序必要的额外特性的 ApplicationContext 的扩展。 

需求的配置
你需要映射你想让 DispatcherServlet 处理的请求，通过使用在 web.xml 文件中的一个 URL 映射。下面是一个显示声明和映射
 HelloWeb DispatcherServlet 的示例： 

<web-app id="WebApp_ID" version="2.4"
    xmlns="http://java.sun.com/xml/ns/j2ee" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
    http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
    <display-name>Spring MVC Application</display-name>
   <servlet>
      <servlet-name>HelloWeb</servlet-name>
      <servlet-class>
         org.springframework.web.servlet.DispatcherServlet
      </servlet-class>
      <load-on-startup>1</load-on-startup>
   </servlet>
   <servlet-mapping>
      <servlet-name>HelloWeb</servlet-name>
      <url-pattern>*.jsp</url-pattern>
   </servlet-mapping>
</web-app>

web.xml 文件将被保留在你的应用程序的 WebContent/WEB-INF 目录下。好的，在初始化 HelloWeb DispatcherServlet 
时，该框架将尝试加载位于该应用程序的 WebContent/WEB-INF 目录中文件名为 [servlet-name]-servlet.xml 的应用程序
内容。在这种情况下，我们的文件将是 HelloWeb-servlet.xml。

接下来， 标签表明哪些 URLs 将被 DispatcherServlet 处理。这里所有以 .jsp 结束的 HTTP 请求将由 HelloWeb 
DispatcherServle t处理。

如果你不想使用默认文件名 [servlet-name]-servlet.xml 和默认位置 WebContent/WEB-INF，你可以通过在 web.xml 文
件中添加 servlet 监听器 ContextLoaderListener 自定义该文件的名称和位置，如下所示：


 