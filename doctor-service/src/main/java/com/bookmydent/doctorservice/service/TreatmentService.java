package com.bookmydent.doctorservice.service;

import org.springframework.http.ResponseEntity;

import com.bookmydent.doctorservice.dto.Response;
import com.bookmydent.doctorservice.dto.TreatmentDTO;

public interface TreatmentService {
    ResponseEntity<Response> addTreatment(TreatmentDTO dto);
    ResponseEntity<Response> getAllTreatments();
    ResponseEntity<Response> getTreatmentById(String id, String hospitalId);
    ResponseEntity<Response> deleteTreatmentById(String id, String hospitalId);
    ResponseEntity<Response> updateTreatmentById(String id, String hospitalId, TreatmentDTO dto);
}

