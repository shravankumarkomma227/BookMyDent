package com.bookmydent.adminService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.adminService.entity.RefreshJwtToken;


public interface RefreshTokenRepository extends MongoRepository<RefreshJwtToken, String> {
	
	public RefreshJwtToken findByTokenName(String name);

}
