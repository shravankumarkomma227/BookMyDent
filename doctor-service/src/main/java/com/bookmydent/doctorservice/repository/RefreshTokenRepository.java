package com.bookmydent.doctorservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.doctorservice.model.RefreshJwtToken;


public interface RefreshTokenRepository extends MongoRepository<RefreshJwtToken, String> {
	
	public RefreshJwtToken findByTokenName(String name);

}
