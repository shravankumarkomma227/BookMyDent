package com.bookmydent.clinicadmin.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.clinicadmin.entity.Incident;
import com.bookmydent.clinicadmin.enumclasses.IncidentStatus;

public interface IncidentRepository extends MongoRepository<Incident, String> {
List<Incident>findByStatus(IncidentStatus status);
}
