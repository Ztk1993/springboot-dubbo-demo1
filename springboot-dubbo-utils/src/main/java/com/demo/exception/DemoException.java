package com.demo.exception;

public class DemoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	
	private Integer code;
	
	public DemoException(Integer code, String message){
		super(message);
		this.code = code;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
	
	

}
