package com.dentalcare.adminService.service;

import com.dentalcare.adminService.dto.StoreUpdatedQAInClinicsDTO;
import com.dentalcare.adminService.util.Response;

public interface StoreUpdatedQAInClinicsService {

	Response updateQaAndAnswers(String storeUpdatedQAInClinicsDTO, StoreUpdatedQAInClinicsDTO dto);

	Response getById(String id);

	Response getAll();

	Response deleteById(String id);

	Response saveQaAndAnswers(StoreUpdatedQAInClinicsDTO StoreUpdatedQAInClinicsDTO);

}
