package com.bus.portal.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bus.portal.model.RoleModel;



public interface RoleRepository extends JpaRepository<RoleModel, Long>{
	RoleModel findByName(String name);
}
