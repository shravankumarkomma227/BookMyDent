package com.dentalcare.doctorservice.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dentalcare.doctorservice.dermacaredoctorutils.AutoCheckJwtToken;
import com.dentalcare.doctorservice.dto.Response;
import com.dentalcare.doctorservice.dto.VitalsDTO;
import com.dentalcare.doctorservice.feignclient.ClinicAdminServiceClient;
import com.dentalcare.doctorservice.service.DoctorVitalsService;

@Service
public class DoctorVitalsServiceImpl implements DoctorVitalsService {

    @Autowired
    private ClinicAdminServiceClient clinicAdminServiceClient;
    
    
    @Autowired
   	private AutoCheckJwtToken token;
   	

    @Override
    public ResponseEntity<Response> addVitals(String patientId, VitalsDTO dto) {
        return extractErrorResponse(clinicAdminServiceClient.addVitals(token.access_token, patientId, dto));
    }

    @Override
    public ResponseEntity<Response> getVitals(String patientId) {
        return extractErrorResponse(clinicAdminServiceClient.getVitals(token.access_token,patientId));
    }

    @Override
    public ResponseEntity<Response> deleteVitals(String patientId) {
        return extractErrorResponse(clinicAdminServiceClient.delVitals(token.access_token,patientId));
    }

    @Override
    public ResponseEntity<Response> updateVitals(String patientId, VitalsDTO dto) {
        return extractErrorResponse(clinicAdminServiceClient.updateVitals(token.access_token,patientId, dto));
    }

    /**
     * Only return the response if it's an error (non-2xx status).
     * Otherwise return null or your own success response.
     */
    private ResponseEntity<Response> extractErrorResponse(ResponseEntity<Response> responseEntity) {
        if (!responseEntity.getStatusCode().is2xxSuccessful()) {
            // Return only the error body & status
            return ResponseEntity
                    .status(responseEntity.getStatusCode())
                    .body(responseEntity.getBody());
        }
        return null; // no error
    }
}
