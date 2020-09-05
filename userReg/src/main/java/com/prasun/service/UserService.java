package com.prasun.service;

import java.util.List;

import com.prasun.entities.UserEntity;

public interface UserService {
	
	UserEntity saveUser(UserEntity user);
	UserEntity updateUser(UserEntity user);
	UserEntity getUserEntityById(int id);
	List<UserEntity> getAllUser();

}
