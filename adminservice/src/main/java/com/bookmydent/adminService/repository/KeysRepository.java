package com.bookmydent.adminService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.adminService.entity.JwtKeysEntity;


public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
