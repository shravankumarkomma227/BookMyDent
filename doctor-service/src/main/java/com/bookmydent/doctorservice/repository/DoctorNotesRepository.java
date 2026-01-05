package com.bookmydent.doctorservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.doctorservice.model.DoctorNotes;

public interface DoctorNotesRepository extends MongoRepository<DoctorNotes, String> {

	DoctorNotes findByDoctorId(String doctorId);
}
