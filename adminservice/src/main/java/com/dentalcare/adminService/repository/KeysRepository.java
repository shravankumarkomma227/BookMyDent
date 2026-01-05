package com.dentalcare.adminService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.JwtKeysEntity;


public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
