package com.bookmydent.adminService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookmydent.adminService.entity.QuetionsAndAnswerForAddClinic;

@Repository
public interface QuetionsAndAnswerForAddClinicRepository extends MongoRepository<QuetionsAndAnswerForAddClinic, String> {

}