package com.bookmydent.adminService.service;

import com.bookmydent.adminService.dto.QuetionsAndAnswerForAddClinicDTO;
import com.bookmydent.adminService.util.Response;

public interface QuetionsAndAnswerForAddClinicService {

	Response saveQuetions(QuetionsAndAnswerForAddClinicDTO dto);

	Response updateQuetions(QuetionsAndAnswerForAddClinicDTO dto);

	Response getQuetions();



}