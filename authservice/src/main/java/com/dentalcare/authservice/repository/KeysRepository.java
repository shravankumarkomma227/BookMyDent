package com.dentalcare.authservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.authservice.entity.JwtKeysEntity;

public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
