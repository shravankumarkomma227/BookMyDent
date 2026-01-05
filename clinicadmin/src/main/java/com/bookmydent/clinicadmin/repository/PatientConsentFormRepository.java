package com.bookmydent.clinicadmin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.clinicadmin.entity.PatientConsentForm;

public interface PatientConsentFormRepository extends MongoRepository<PatientConsentForm, String> {

}
