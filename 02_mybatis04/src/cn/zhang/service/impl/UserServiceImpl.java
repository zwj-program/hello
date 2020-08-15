package cn.zhang.service.impl;

import java.util.List;

import cn.zhang.dao.UserDao;
import cn.zhang.domain.User;
import cn.zhang.service.UserService;
import cn.zhang.util.SqlSessionUtil;
//service�����ʱ���з�����Ҫ�����񣬵������������鷳�����óɴ������������
//��ҵ�����չ������ѯ�����а����˲����ӷ����漰����Ҳ���ṩ����֧�֡�
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
