package com.prasun.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasun.entities.UserEntity;
import com.prasun.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepo.save(user);
	}

	@Override
	public UserEntity updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public UserEntity getUserEntityById(int id) {
		// TODO Auto-generated method stub
		return userRepo.getOne(id);
	}

	@Override
	public List<UserEntity> getAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	

}
