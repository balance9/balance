package com.balance.common.auth.user.service;

import com.balance.base.domain.PaginationData;
import com.balance.common.auth.user.domain.User;
import com.balance.common.auth.user.dto.Pagination;

public interface UserService {

	public PaginationData<User> queryUsers(int current, int rowCount);

}
