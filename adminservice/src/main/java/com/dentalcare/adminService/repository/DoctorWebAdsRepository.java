package com.dentalcare.adminService.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.DoctorWebAds;

public interface DoctorWebAdsRepository extends MongoRepository<DoctorWebAds, ObjectId> {
}
