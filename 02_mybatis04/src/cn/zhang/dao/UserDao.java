package cn.zhang.dao;

import java.util.List;

import cn.zhang.domain.User;

public interface UserDao {
	public User findById(String id);
	public void save(User user);
	public List<User> findAll();
}
