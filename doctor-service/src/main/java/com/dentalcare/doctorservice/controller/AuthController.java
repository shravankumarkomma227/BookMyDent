package com.dentalcare.doctorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentalcare.doctorservice.dto.AccessTokenAndRefreshToken;
import com.dentalcare.doctorservice.dto.DoctorLoginDTO;
import com.dentalcare.doctorservice.dto.Response;
import com.dentalcare.doctorservice.service.AuthService;

@RestController
@RequestMapping("/doctors")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/doctorLogin")
	public ResponseEntity<Response> clinicLogin(@RequestBody DoctorLoginDTO doctorLoginDTO ){
		return authService.doctorLogin(doctorLoginDTO);
	}	
	
	 @PostMapping("/newAccessTokenForDoctorService")
		public  ResponseEntity<Response> requestForNewAccessTokenByRefreshToken(@RequestBody AccessTokenAndRefreshToken accessTokenAndRefreshToken ){
			return authService.requestForNewJwtTokenByRefreshToken(accessTokenAndRefreshToken.getRefreshToken());
	}
}