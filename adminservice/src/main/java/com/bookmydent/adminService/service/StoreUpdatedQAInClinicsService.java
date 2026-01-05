package com.bookmydent.adminService.service;

import com.bookmydent.adminService.dto.StoreUpdatedQAInClinicsDTO;
import com.bookmydent.adminService.util.Response;

public interface StoreUpdatedQAInClinicsService {

	Response updateQaAndAnswers(String storeUpdatedQAInClinicsDTO, StoreUpdatedQAInClinicsDTO dto);

	Response getById(String id);

	Response getAll();

	Response deleteById(String id);

	Response saveQaAndAnswers(StoreUpdatedQAInClinicsDTO StoreUpdatedQAInClinicsDTO);

}
