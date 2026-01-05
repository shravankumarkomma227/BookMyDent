package com.bookmydent.authservice.service;

import java.util.Map;
import java.util.Set;
import org.springframework.http.ResponseEntity;

import com.bookmydent.authservice.dto.ServiceDetailsDto;
import com.bookmydent.authservice.util.Response;

public interface AuthService {
	
	public ResponseEntity<Response> serviceRegistration(ServiceDetailsDto serviceDetailsDto);
	
	public ResponseEntity<Response> serviceLogin(ServiceDetailsDto serviceDetailsDto);

	public Map<String,Set<String>> jwks();
}
