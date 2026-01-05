package com.bookmydent.clinicadmin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.clinicadmin.entity.ClinicAdminDeviceTokenEntity;

public interface ClinicAdminWebFcmTokenRepository extends MongoRepository<ClinicAdminDeviceTokenEntity, String>{

	ClinicAdminDeviceTokenEntity findByClinicIdAndBranchId(String clinicId, String branchId);
}
