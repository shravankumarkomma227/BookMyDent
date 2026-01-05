package com.dentalcare.authservice.repository;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.authservice.entity.ServiceDetailsEntity;

public interface AuthRepository extends MongoRepository<ServiceDetailsEntity,String>{
	
	ServiceDetailsEntity findByUserNameAndServiceId(String username,String serviceId);

	Optional<ServiceDetailsEntity> findByUserName(String username);

	 
}
