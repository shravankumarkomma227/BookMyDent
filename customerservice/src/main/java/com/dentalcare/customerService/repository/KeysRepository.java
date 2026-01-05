package com.dentalcare.customerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.customerService.entity.JwtKeysEntity;

public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
