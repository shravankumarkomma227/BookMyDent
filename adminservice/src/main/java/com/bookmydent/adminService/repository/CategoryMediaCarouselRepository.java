package com.bookmydent.adminService.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.adminService.entity.CategoryMediaCarousel;


public interface CategoryMediaCarouselRepository extends MongoRepository<CategoryMediaCarousel, ObjectId> {
}
