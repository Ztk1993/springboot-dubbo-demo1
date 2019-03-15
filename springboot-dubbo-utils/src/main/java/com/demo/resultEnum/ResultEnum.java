package com.demo.resultEnum;

public enum ResultEnum {
	
	defaultds(1,"")
	;
	
	
	private Integer code;
	
	
	private String msg;
	
	ResultEnum(Integer code, String msg){
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}
	
	

}
