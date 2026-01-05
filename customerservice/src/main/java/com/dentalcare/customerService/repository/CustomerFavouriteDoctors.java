package com.dentalcare.customerService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.customerService.entity.FavouriteDoctorsEntity;

public interface CustomerFavouriteDoctors extends MongoRepository<FavouriteDoctorsEntity,String> {

}
