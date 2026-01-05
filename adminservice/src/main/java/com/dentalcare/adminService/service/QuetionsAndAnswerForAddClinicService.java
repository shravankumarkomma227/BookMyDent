package com.dentalcare.adminService.service;

import com.dentalcare.adminService.dto.QuetionsAndAnswerForAddClinicDTO;
import com.dentalcare.adminService.util.Response;

public interface QuetionsAndAnswerForAddClinicService {

	Response saveQuetions(QuetionsAndAnswerForAddClinicDTO dto);

	Response updateQuetions(QuetionsAndAnswerForAddClinicDTO dto);

	Response getQuetions();



}