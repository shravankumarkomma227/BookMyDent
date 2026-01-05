package com.bookmydent.doctorservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.doctorservice.model.DoctorPrescription;

public interface DoctorPrescriptionRepository extends MongoRepository<DoctorPrescription, String> {

    // ✅ Correct: finds all prescriptions containing a medicine with given ID
    List<DoctorPrescription> findByMedicines_Id(String medicineId);
    List<DoctorPrescription> findByClinicId(String clinicId);

}
