package com.bookmydent.adminService.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.adminService.entity.ServiceMediaCarousel;


public interface ServiceMediaCarousalRepository extends MongoRepository<ServiceMediaCarousel, ObjectId>{

}
