package com.demo.service;

import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements IItemService{

	public boolean checkItemStatus(String id) {
		if(id.contains("1")){
			return true;
		}
		return false;
	}

}
