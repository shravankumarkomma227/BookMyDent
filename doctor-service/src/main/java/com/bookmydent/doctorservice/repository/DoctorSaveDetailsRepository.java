package com.bookmydent.doctorservice.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookmydent.doctorservice.model.DoctorPrescription;
import com.bookmydent.doctorservice.model.DoctorSaveDetails;

@Repository
public interface DoctorSaveDetailsRepository extends MongoRepository<DoctorSaveDetails, String> {

	List<DoctorSaveDetails> findByPatientId(String patientId);
	List<DoctorSaveDetails> findByPatientIdAndBookingId(String patientId, String bookingId);

}
