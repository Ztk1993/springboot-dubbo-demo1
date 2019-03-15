package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domain.User;
import com.demo.service.IUserService;

@RestController
public class UserController {
	
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private IUserService UserServiceImpl;
	
	@RequestMapping("/save")
	public String insert(@RequestParam("userName") String userName,
			@RequestParam("passWord") String passWord){
		User user = new User();
		user.setUserName(userName);
		user.setPassWord(Integer.parseInt(passWord));
		user.setAge(11);
		try {
			UserServiceImpl.insert(user);
			logger.info("操作结果：{}","成功！！！！");
			return "保存成功";
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("操作结果：{}","异常！！！！");
			return "保存异常";
		}
	}
	
	@GetMapping("/findId")
	public String find(@RequestParam("id") String id){
		User user = UserServiceImpl.find(Integer.parseInt(id));
		return user.toString();
	}
	
	@GetMapping("/deleteId")
	public String delete(@RequestParam("id") String id){
		try {
			UserServiceImpl.delete(Integer.parseInt(id));
			return "删除成功";
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return "删除失败，操作异常";
		}
		
	}
	
}
