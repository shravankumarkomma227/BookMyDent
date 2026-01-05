package com.bookmydent.adminService.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.adminService.entity.DoctorWebAds;

public interface DoctorWebAdsRepository extends MongoRepository<DoctorWebAds, ObjectId> {
}
