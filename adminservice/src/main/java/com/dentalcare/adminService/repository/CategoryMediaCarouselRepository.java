package com.dentalcare.adminService.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.CategoryMediaCarousel;


public interface CategoryMediaCarouselRepository extends MongoRepository<CategoryMediaCarousel, ObjectId> {
}
