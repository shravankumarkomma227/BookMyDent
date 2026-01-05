package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.CustomConsentFormDTO;
import com.bookmydent.clinicadmin.dto.Response;

public interface CustomConsentFormService {
	public Response addCustomConsentForm(String hospitalId, String consentFormType, CustomConsentFormDTO dto);

	Response updateCustomConsentForm(String hospitalId, String consentFormType, CustomConsentFormDTO dto);

	Response getProcedureConsentForm(String hospitalId, String subServiceId);

	Response getConsentForm(String hospitalId, String consentFormType);
}
