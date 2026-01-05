package com.dentalcare.adminService.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.Branch;

public interface HospitalBranchRepository extends MongoRepository<Branch, String>  {

	 // Find branches by clinicId (used in createBranch)
    List<Branch> findByClinicId(String clinicId);

    // Find branch by branchId (custom field, not the PK)
    Optional<Branch> findByBranchId(String branchId);

    // Delete branch by branchId
    void deleteByBranchId(String branchId);
    

}


