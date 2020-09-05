package com.prasun.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.prasun.entities.UserEntity;



public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	
	@Query("select gender,count(gender) from  UserEntity group by gender")
	public List<Object[]> findTypeAndFindCount();

	public UserEntity findByEmail(String email);
}
