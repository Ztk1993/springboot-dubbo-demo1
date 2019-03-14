package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.IItemService;

@RestController
public class ItemController {
	
	@Autowired
	private IItemService itemService;
	
	@RequestMapping("/canbuy")
	public String canBuy(@RequestParam("id") String id){
		boolean flag = itemService.checkItemStatus(id);
		if(flag){
			return "can buy";
		}else {
			return "not can buy";
		}
	}

}
