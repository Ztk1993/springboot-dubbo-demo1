package com.demo.service;

import com.demo.domain.User;

public interface IUserService {

	public void insert(User user);

    public void update(User user);
    
    public void delete(int id);
    
    public User find(int id);
}
