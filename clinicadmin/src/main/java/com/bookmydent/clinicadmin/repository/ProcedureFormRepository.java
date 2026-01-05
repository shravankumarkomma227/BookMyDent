package com.bookmydent.clinicadmin.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bookmydent.clinicadmin.entity.ProcedureForm;

@Repository
public interface ProcedureFormRepository extends MongoRepository<ProcedureForm, ObjectId> {
	
	Optional<ProcedureForm> findByHospitalIdAndId(String hospitalId, ObjectId id);

}
