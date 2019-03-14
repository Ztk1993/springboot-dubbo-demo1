package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.IUserDao;
import com.demo.domain.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserDao userDao;

	@Override
	public void insert(User user) {
		userDao.insert(user);

	}

	@Override
	public void update(User user) {
		userDao.update(user);

	}

	@Override
	public void delete(int id) {
		userDao.delete(id);

	}

	@Override
	public User find(int id) {
		User user = userDao.find(id);
		return user;
	}

}
