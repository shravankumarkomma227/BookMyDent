package com.bookmydent.doctorservice.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.bookmydent.doctorservice.dto.NotificationDTO;
import com.bookmydent.doctorservice.dto.ResBody;

public interface NotificationService {
	
	public ResponseEntity<ResBody<List<NotificationDTO>>> notificationToDoctor(String hospitalId,
			 String doctorId);
	
}