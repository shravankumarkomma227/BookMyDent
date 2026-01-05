package com.bookmydent.doctorservice.service;

import org.springframework.http.ResponseEntity;

import com.bookmydent.doctorservice.dto.Response;
import com.bookmydent.doctorservice.dto.VitalsDTO;

public interface DoctorVitalsService {

    ResponseEntity<Response> addVitals(String patientId, VitalsDTO dto);

    ResponseEntity<Response> getVitals(String patientId);

    ResponseEntity<Response> deleteVitals(String patientId);

    ResponseEntity<Response> updateVitals(String patientId, VitalsDTO dto);
}

