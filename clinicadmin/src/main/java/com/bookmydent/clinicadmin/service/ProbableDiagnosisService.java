package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.ProbableDiagnosisDTO;
import com.bookmydent.clinicadmin.dto.Response;

public interface ProbableDiagnosisService {
	public Response addDisease(ProbableDiagnosisDTO dto);

	public Response getAllDiseases();

//	public Response getDiseaseById(String id);
//	public Response deleteDiseaseById(String id);
//	public Response updateDiseaseById(String id, ProbableDiagnosisDTO dto);

	Response getDiseaseById(String id, String hospitalId);

	Response deleteDiseaseById(String id, String hospitalId);

	Response updateDiseaseById(String id, String hospitalId, ProbableDiagnosisDTO dto);
	Response getAllDiseasesByHospitalId(String hospitalId);


}
