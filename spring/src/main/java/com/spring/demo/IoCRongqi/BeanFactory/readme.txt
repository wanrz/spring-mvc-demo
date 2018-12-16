Spring 的 BeanFactory 容器
这是一个最简单的容器，它主要的功能是为依赖注入 （DI） 提供支持，这个容器接口在
 org.springframework.beans.factory.BeanFactor 中被定义。BeanFactory和相关的接口，
 比如BeanFactoryAware、DisposableBean、InitializingBean，仍旧保留在 Spring 中，
 主要目的是向后兼容已经存在的和那些 Spring 整合在一起的第三方框架。

在 Spring 中，有大量对 BeanFactory 接口的实现。其中，最常被使用的是 XmlBeanFactory 类。这个容器从一个 XML
 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用。

在资源宝贵的移动设备或者基于 applet 的应用当中， BeanFactory 会被优先选择。否则，
一般使用的是 ApplicationContext，除非你有更好的理由选择 BeanFactory。