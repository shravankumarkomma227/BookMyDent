
package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.Response;
import com.bookmydent.clinicadmin.dto.VitalsDTO;

public interface VitalService {

	public Response postVitalsById(String patientId, VitalsDTO dto);

	public Response updateVitals(String patientId, VitalsDTO dto);

	public Response getVitalsByPatientId(String patientId);

	public Response deleteVitals(String patiendId);

}