package com.bookmydent.doctorservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.doctorservice.model.DoctorDeviceIdsEntity;

public interface DoctorDeviceIdsRepository extends MongoRepository<DoctorDeviceIdsEntity, String>{

	DoctorDeviceIdsEntity findByDoctorId(String doctorId);
}


