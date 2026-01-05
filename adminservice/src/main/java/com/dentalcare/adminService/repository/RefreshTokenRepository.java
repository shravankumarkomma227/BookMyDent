package com.dentalcare.adminService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.RefreshJwtToken;


public interface RefreshTokenRepository extends MongoRepository<RefreshJwtToken, String> {
	
	public RefreshJwtToken findByTokenName(String name);

}
