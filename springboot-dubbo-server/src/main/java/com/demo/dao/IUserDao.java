package com.demo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.demo.domain.User;

@Mapper
public interface IUserDao {

	public void insert(User user);

    public void update(User user);
    
    public void delete(int id);
    
    public User find(int id);
}
