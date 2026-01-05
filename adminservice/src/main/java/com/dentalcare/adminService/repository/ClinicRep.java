package com.dentalcare.adminService.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dentalcare.adminService.entity.Clinic;

@Repository
public interface ClinicRep extends MongoRepository<Clinic, String> {

	Clinic findByHospitalId(String id);

	Clinic findByContactNumber(String customerNumber);

	Clinic findFirstByOrderByHospitalIdDesc();

	void deleteByHospitalId(String id);

	List<Clinic> findByRecommendedTrue();

	List<Clinic> findAllByOrderByRecommendedDescNameAsc();
}
