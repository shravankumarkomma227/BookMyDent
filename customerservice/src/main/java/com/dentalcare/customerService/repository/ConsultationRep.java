package com.dentalcare.customerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.customerService.entity.ConsultationEntity;

public interface ConsultationRep extends MongoRepository<ConsultationEntity, String> {

	ConsultationEntity findByconsultationId(String id);
	
}
