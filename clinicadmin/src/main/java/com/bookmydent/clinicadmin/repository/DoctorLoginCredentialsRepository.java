package com.bookmydent.clinicadmin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.clinicadmin.entity.DoctorLoginCredentials;

import java.util.Optional;

public interface DoctorLoginCredentialsRepository extends MongoRepository<DoctorLoginCredentials, String> {
    Optional<DoctorLoginCredentials> findByUsername(String username);
    boolean existsByUsername(String username);
	Optional<DoctorLoginCredentials> findByDoctorId(String doctorId);
}
