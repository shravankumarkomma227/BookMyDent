package com.dentalcare.authservice.service;

import java.util.Map;
import java.util.Set;
import org.springframework.http.ResponseEntity;

import com.dentalcare.authservice.dto.ServiceDetailsDto;
import com.dentalcare.authservice.util.Response;

public interface AuthService {
	
	public ResponseEntity<Response> serviceRegistration(ServiceDetailsDto serviceDetailsDto);
	
	public ResponseEntity<Response> serviceLogin(ServiceDetailsDto serviceDetailsDto);

	public Map<String,Set<String>> jwks();
}
