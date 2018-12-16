package com.spring.demo.Bean.after;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
	   public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	      System.out.println("BeforeInitialization : " + beanName);
	      if(beanName.equals("helloWorld")){
	    	  System.out.println("helloWorld 处理前被拦截");
	      }
	      return bean;  // you can return any other object as well
	   }
	   public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	      System.out.println("AfterInitialization : " + beanName);
	      if(beanName.equals("helloWorld")){
	    	  System.out.println("helloWorld 处理后被拦截");
	      }
	      return bean;  // you can return any other object as well
	   }
	}
