package com.demo.handle;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.exception.DemoException;
import com.demo.result.Result;
import com.demo.result.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {

	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public Result<?> handle(Exception e){
		if(e instanceof DemoException){
			DemoException demoException = (DemoException) e;
			return ResultUtil.error(demoException.getCode(), demoException.getMessage());
		}
		return ResultUtil.error(-1, "未知错误");
	}
}