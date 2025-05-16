package com.bus.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.portal.model.UserModel;


public interface UserRepository extends JpaRepository<UserModel, Long>{
	UserModel findByUsername(String username);
}
