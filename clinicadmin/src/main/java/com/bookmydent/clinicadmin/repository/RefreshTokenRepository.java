package com.bookmydent.clinicadmin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.clinicadmin.entity.RefreshJwtToken;

public interface RefreshTokenRepository extends MongoRepository<RefreshJwtToken, String> {
	
	public RefreshJwtToken findByTokenName(String name);

}
