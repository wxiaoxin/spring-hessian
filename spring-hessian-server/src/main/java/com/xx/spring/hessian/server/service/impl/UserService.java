package com.xx.spring.hessian.server.service.impl;

import com.xx.spring.hessian.server.model.User;
import com.xx.spring.hessian.server.service.IUserService;

public class UserService implements IUserService {

	public UserService() {
		super();
	}

	public User getUser() {
		User user = new User();
		user.setName("admin");
		user.setPassword("123456");
		return user;
	}

}
