package com.bookmydent.customerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.customerService.entity.JwtKeysEntity;

public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
