package cn.zhang.service.impl;

import java.util.List;

import cn.zhang.dao.UserDao;
import cn.zhang.domain.User;
import cn.zhang.service.UserService;
import cn.zhang.util.SqlSessionUtil;
//service层设计时所有方法都要求事务，单个方法设置麻烦，设置成代理类完成事务。
//当业务层扩展——查询方法中包含了部分子方法涉及事务，也能提供事务支持。
public class UserServiceImpl implements UserService{
	private UserDao userDao=SqlSessionUtil.getSession().getMapper(UserDao.class);
	
	@Override
	public User findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
