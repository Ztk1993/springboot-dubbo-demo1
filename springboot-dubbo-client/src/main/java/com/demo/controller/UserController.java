package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.User;
import com.demo.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@RequestMapping("/save")
	public String insert(@RequestParam("userName") String userName,
			@RequestParam("passWord") String passWord){
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(Integer.parseInt(passWord));
		user.setAge(11);
		try {
			userService.insert(user);
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "保存异常";
		}
	}
	
	@RequestMapping("/findId")
	public String find(@RequestParam("id") String id){
		User user = userService.find(Integer.parseInt(id));
		return user.toString();
	}
	
	@RequestMapping("/deleteId")
	public String delete(@RequestParam("id") String id){
		try {
			userService.delete(Integer.parseInt(id));
			return "删除成功";
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return "删除失败，操作异常";
		}
		
	}
	
}
