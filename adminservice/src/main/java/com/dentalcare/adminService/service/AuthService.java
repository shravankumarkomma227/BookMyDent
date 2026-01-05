package com.dentalcare.adminService.service;

import org.springframework.http.ResponseEntity;

import com.dentalcare.adminService.dto.RegisterAndLoginDto;
import com.dentalcare.adminService.util.Response;

public interface AuthService {
	
	public Response adminRegister(RegisterAndLoginDto helperAdmin);
		
	public Response adminLogin(String userName,String password);
	
	 public Response clinicLogin(String userName ); 
	 
	 public ResponseEntity<Response> requestForNewJwtTokenByRefreshToken(String refreshToken);
	 
	
}
