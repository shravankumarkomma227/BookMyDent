package com.dentalcare.doctorservice.service;

import org.springframework.http.ResponseEntity;

import com.dentalcare.doctorservice.dto.DoctorLoginDTO;
import com.dentalcare.doctorservice.dto.Response;


public interface AuthService {
	
public ResponseEntity<Response> doctorLogin(DoctorLoginDTO doctorLoginDTO);

public ResponseEntity<Response> requestForNewJwtTokenByRefreshToken(String refreshToken);
	
}
