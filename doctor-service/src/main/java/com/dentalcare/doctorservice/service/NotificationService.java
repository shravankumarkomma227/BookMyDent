package com.dentalcare.doctorservice.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.dentalcare.doctorservice.dto.NotificationDTO;
import com.dentalcare.doctorservice.dto.ResBody;

public interface NotificationService {
	
	public ResponseEntity<ResBody<List<NotificationDTO>>> notificationToDoctor(String hospitalId,
			 String doctorId);
	
}