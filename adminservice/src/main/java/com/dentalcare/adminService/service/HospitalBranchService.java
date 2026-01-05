package com.dentalcare.adminService.service;

import org.springframework.http.ResponseEntity;

import com.dentalcare.adminService.dto.BranchDTO;
import com.dentalcare.adminService.util.Response;

public interface HospitalBranchService {
	public Response createBranch(BranchDTO branch);
	 ResponseEntity<?> getBranchById(String branchId);
	Response updateBranch(String branchId, BranchDTO branch);
	Response deleteBranch(String branchId);
	Response getAllBranches();
	public  ResponseEntity<?> getBranchByClinicId(String clinicId);
}