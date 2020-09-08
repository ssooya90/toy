package com.ssooya.aop.service;

import com.ssooya.aop.aspect.UserPerformance;
import com.ssooya.aop.domain.user.User;
import com.ssooya.aop.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService extends UserPerformance {

	@Autowired
	private UserRepository repository;

	@Override
	public List<User> getUsers(){
		return repository.findAll();
	}
}
