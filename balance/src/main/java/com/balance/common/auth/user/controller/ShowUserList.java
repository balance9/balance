/**
 * 
 */
package com.balance.common.auth.user.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.balance.base.domain.PaginationData;
import com.balance.common.auth.user.domain.User;
import com.balance.common.auth.user.service.UserService;

/**
 * @author duanp
 * 
 */
@Controller
public class ShowUserList {

	@Autowired
	private UserService userServices = null;

	@RequestMapping(value = "/user/showUserList")
	@ResponseBody
	public PaginationData<User> getUserData(int current, int rowCount) {
		PaginationData<User> users = userServices.queryUsers(current, rowCount);
		return users;
	}

}
