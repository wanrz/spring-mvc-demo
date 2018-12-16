package com.spring.demo.AOP.AspectJ;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectJLogging {
	/** Following is the definition for a pointcut to select
	    *  all the methods available. So advice will be called
	    *  for all the methods.
	    */
	   @Pointcut("execution(* com.spring.demo.Annotation.Required.*.*(..))")
	   private void aopPointcut(){}
	   /** 
	    * This is the method which I would like to execute
	    * before a selected method execution.
	    */
	   @Before("aopPointcut()")
	   public void beforeAdvice(){
	      System.out.println("注解方式 Going to setup student profile.");
	   }
	   /** 
	    * This is the method which I would like to execute
	    * after a selected method execution.
	    */
	   @After("aopPointcut()")
	   public void afterAdvice(){
	      System.out.println("注解方式 Student profile has been setup.");
	   }
	   /** 
	    * This is the method which I would like to execute
	    * when any method returns.
	    */
	   @AfterReturning(pointcut = "aopPointcut()", returning="retVal")
	   public void afterReturningAdvice(Object retVal){
	      System.out.println("注解方式 Returning:" + retVal.toString() );
	   }
	   /**
	    * This is the method which I would like to execute
	    * if there is an exception raised by any method.
	    */
	   @AfterThrowing(pointcut = "aopPointcut()", throwing = "ex")
	   public void AfterThrowingAdvice(IllegalArgumentException ex){
	      System.out.println("注解方式 There has been an exception: " + ex.toString());   
	   } 
}
