package com.bookmydent.clinicadmin.repository;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookmydent.clinicadmin.entity.LabTest;

@Repository
public interface LabTestRepository extends MongoRepository<LabTest, ObjectId> {
	public Optional<LabTest> findByIdAndHospitalId(ObjectId id, String hospitalId);

	List<LabTest> findByHospitalId(String hospitalId);
}
