package com.balance.study.service;

import java.util.List;

import com.balance.study.domain.User;

public interface UserService {
	/**
	 * ����û�
	 * 
	 * @param user
	 */
	void addUser(User user);

	/**
	 * �����û�id��ȡ�û�
	 * 
	 * @param userId
	 * @return
	 */
	User getUserById(String userId);

	/**
	 * ��ȡ�����û���Ϣ
	 * 
	 * @return List<User>
	 */
	List<User> getAllUser();
}
