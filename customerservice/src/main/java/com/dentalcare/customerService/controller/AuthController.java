package com.dentalcare.customerService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentalcare.customerService.dto.AccessTokenAndRefreshToken;
import com.dentalcare.customerService.dto.LoginDTO;
import com.dentalcare.customerService.service.AuthService;
import com.dentalcare.customerService.util.Response;

@RestController
@RequestMapping("/customerpublicapis")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/VerifyUserCredentialsAndGenerateAndSendOtp")
	public ResponseEntity<Response> verifyUserCredentialsAndGenerateAndSendOtp(@RequestBody LoginDTO loginDTO) {
		return authService.verifyUserCredentialsAndGenerateAndSendOtp(loginDTO);
	}

	
	@PostMapping("/verifyOtp")
	public ResponseEntity<?> verifyOtp(@RequestBody LoginDTO loginDTO) {
		return authService.verifyOtp(loginDTO);
	}

	
	@PostMapping("/resendOtp")
	public ResponseEntity<Response> resendOtp(@RequestBody LoginDTO loginDTO) {
		return authService.resendOtp(loginDTO);
	}
	
	
	@PostMapping("/newAccessTokenForCustomerService")
	public  ResponseEntity<Response> requestForNewAccessTokenByRefreshToken(@RequestBody AccessTokenAndRefreshToken accessTokenAndRefreshToken ){
		return authService.requestForNewJwtTokenByRefreshToken(accessTokenAndRefreshToken.getRefreshToken());
	}
	
	
	@GetMapping("/oauth2tokens")
	public ResponseEntity<Response> oauth2tokens() {		   
	return authService.generateTokensForOauth2();
		     
}}
