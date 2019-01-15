package com.spring.demo.Mvc;

/**
 * <p>ClassName: SpringException</p>
 * Description:加点描述<br/>
 * @date 2018年12月16日 下午7:14:23 
 * @author wanrz
 * @version 1.0
 * @since JDK 1.7
 */ 
public class SpringException extends RuntimeException {
	private String exceptionMsg;

	public SpringException(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}

	public String getExceptionMsg() {
		return this.exceptionMsg;
	}

	public void setExceptionMsg(String exceptionMsg) {
		this.exceptionMsg = exceptionMsg;
	}
}
