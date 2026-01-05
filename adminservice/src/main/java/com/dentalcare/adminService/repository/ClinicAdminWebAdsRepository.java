package com.dentalcare.adminService.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.ClinicAdminWebAds;

public interface ClinicAdminWebAdsRepository extends MongoRepository<ClinicAdminWebAds, ObjectId> {
}
