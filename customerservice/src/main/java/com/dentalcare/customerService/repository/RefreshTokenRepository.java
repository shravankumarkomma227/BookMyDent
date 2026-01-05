package com.dentalcare.customerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.customerService.entity.RefreshJwtToken;

public interface RefreshTokenRepository extends MongoRepository<RefreshJwtToken, String> {
	
	public RefreshJwtToken findByTokenName(String name);

}
