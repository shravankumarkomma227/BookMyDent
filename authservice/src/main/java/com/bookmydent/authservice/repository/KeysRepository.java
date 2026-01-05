package com.bookmydent.authservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.authservice.entity.JwtKeysEntity;

public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
