package com.dentalcare.doctorservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.doctorservice.model.JwtKeysEntity;

public interface KeysRepository extends MongoRepository<JwtKeysEntity, String>{

	JwtKeysEntity findByKeyName(String keyName);
	
}
