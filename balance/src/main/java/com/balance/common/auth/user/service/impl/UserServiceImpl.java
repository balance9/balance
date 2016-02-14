/**
 * 
 */
package com.balance.common.auth.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balance.base.domain.PaginationData;
import com.balance.base.plugin.PaginationHelper;
import com.balance.common.auth.user.dao.UserMapper;
import com.balance.common.auth.user.domain.User;
import com.balance.common.auth.user.dto.Pagination;
import com.balance.common.auth.user.service.UserService;

/**
 * @author duanp
 * 
 */
@Service("userServices")
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	@Autowired
	private UserMapper userMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.balance.common.auth.user.service.UserService#queryUsers(com.balance
	 * .common.auth.user.dto.Pagination)
	 */
	@Override
	public PaginationData<User> queryUsers(int current, int rowCount) {
		PaginationData<User> pages = new PaginationData<User>();
		pages.setCurrent(current);
		pages.setRowCount(rowCount);
		PaginationHelper.startPage(pages);
		// datas.setRows(userMapper.queryUsers());
		userMapper.queryUsers();
		PaginationHelper.endPage();
		return pages;
	}
}
