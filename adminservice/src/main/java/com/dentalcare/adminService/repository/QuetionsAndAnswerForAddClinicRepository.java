package com.dentalcare.adminService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dentalcare.adminService.entity.QuetionsAndAnswerForAddClinic;

@Repository
public interface QuetionsAndAnswerForAddClinicRepository extends MongoRepository<QuetionsAndAnswerForAddClinic, String> {

}