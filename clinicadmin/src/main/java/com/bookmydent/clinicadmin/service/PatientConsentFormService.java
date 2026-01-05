package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.PatientConsentFormDTO;
import com.bookmydent.clinicadmin.dto.Response;

public interface PatientConsentFormService {

	public Response getPatientDetailsForFormUsingBooking(String bookingId, String patientId, String mobileNumber);
	public Response updatePatientConsentForm(String id, PatientConsentFormDTO dto);

}
