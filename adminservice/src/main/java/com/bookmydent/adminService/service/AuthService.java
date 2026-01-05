package com.bookmydent.adminService.service;

import org.springframework.http.ResponseEntity;

import com.bookmydent.adminService.dto.RegisterAndLoginDto;
import com.bookmydent.adminService.util.Response;

public interface AuthService {
	
	public Response adminRegister(RegisterAndLoginDto helperAdmin);
		
	public Response adminLogin(String userName,String password);
	
	 public Response clinicLogin(String userName ); 
	 
	 public ResponseEntity<Response> requestForNewJwtTokenByRefreshToken(String refreshToken);
	 
	
}
