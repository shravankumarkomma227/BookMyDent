package com.bookmydent.doctorservice.service;

import org.springframework.http.ResponseEntity;

import com.bookmydent.doctorservice.dto.DoctorLoginDTO;
import com.bookmydent.doctorservice.dto.Response;


public interface AuthService {
	
public ResponseEntity<Response> doctorLogin(DoctorLoginDTO doctorLoginDTO);

public ResponseEntity<Response> requestForNewJwtTokenByRefreshToken(String refreshToken);
	
}
