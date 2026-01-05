package com.bookmydent.clinicadmin.service;

import org.springframework.http.ResponseEntity;

import com.bookmydent.clinicadmin.dto.ClinicCredentialsDTO;
import com.bookmydent.clinicadmin.dto.DoctorLoginDTO;
import com.bookmydent.clinicadmin.dto.Response;

public interface AuthService {
	
public ResponseEntity<Response> cliniLogin(ClinicCredentialsDTO clinicCredentialsDTO);

public ResponseEntity<Response> doctorLogin(String userName);

public ResponseEntity<Response> requestForNewJwtTokenByRefreshToken(String refreshToken);

}
