package com.dentalcare.doctorservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.doctorservice.model.DoctorNotes;

public interface DoctorNotesRepository extends MongoRepository<DoctorNotes, String> {

	DoctorNotes findByDoctorId(String doctorId);
}
