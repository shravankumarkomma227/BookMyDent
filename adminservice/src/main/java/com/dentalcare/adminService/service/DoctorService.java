package com.dentalcare.adminService.service;

import org.springframework.http.ResponseEntity;

import com.dentalcare.adminService.dto.DoctorsDTO;
import com.dentalcare.adminService.util.Response;

public interface DoctorService {

    ResponseEntity<Response> addDoctor(DoctorsDTO dto);

    ResponseEntity<Response> getAllDoctors();

    ResponseEntity<Response> getDoctorById(String id);

    ResponseEntity<Response> updateDoctorById(String doctorId, DoctorsDTO dto);

    ResponseEntity<Response> deleteDoctorById(String doctorId);

    ResponseEntity<Response> deleteDoctorsByClinic(String clinicId);
}
