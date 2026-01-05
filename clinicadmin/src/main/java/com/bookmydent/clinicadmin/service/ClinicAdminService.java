package com.bookmydent.clinicadmin.service;

import org.springframework.http.ResponseEntity;

import com.bookmydent.clinicadmin.dto.ClinicDTO;
import com.bookmydent.clinicadmin.dto.Response;
import com.bookmydent.clinicadmin.dto.UpdateClinicLoginCredentialsDTO;

public interface ClinicAdminService {

	public Response updateClinicCredentials(UpdateClinicLoginCredentialsDTO updatedCredentials,String userName);
	public Response getClinicById(String hospitalId);
	public Response updateClinic(String hospitalId, ClinicDTO dto);
	public Response deleteClinic(String hospitalId);
	  public ResponseEntity<Response> getClincFcmToken(String clinicId,String branchId );
}
