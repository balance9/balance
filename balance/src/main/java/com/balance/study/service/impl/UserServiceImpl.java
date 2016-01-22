package com.balance.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balance.study.dao.UserMapper;
import com.balance.study.domain.User;
import com.balance.study.service.UserService;

/**
 * @author gacl ʹ��@Serviceע�⽫UserServiceImpl���עΪһ��service service��id��userService
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	/**
	 * ʹ��@Autowiredע���עuserMapper������ ����Ҫʹ��UserMapperʱ��Spring�ͻ��Զ�ע��UserMapper
	 */
	@Autowired
	private UserMapper userMapper;// ע��dao

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public User getUserById(String userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

}
