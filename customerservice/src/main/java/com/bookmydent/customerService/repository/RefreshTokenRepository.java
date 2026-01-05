package com.bookmydent.customerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.customerService.entity.RefreshJwtToken;

public interface RefreshTokenRepository extends MongoRepository<RefreshJwtToken, String> {
	
	public RefreshJwtToken findByTokenName(String name);

}
