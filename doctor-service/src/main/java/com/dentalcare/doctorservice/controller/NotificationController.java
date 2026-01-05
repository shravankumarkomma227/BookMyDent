package com.dentalcare.doctorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentalcare.doctorservice.dto.NotificationDTO;
import com.dentalcare.doctorservice.dto.NotificationResponse;
import com.dentalcare.doctorservice.dto.ResBody;
import com.dentalcare.doctorservice.service.NotificationService;

@RestController
@RequestMapping("/doctors")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class NotificationController {
	
	@Autowired
	private NotificationService notificationService;
	
	@GetMapping("/notificationToDoctor/{hospitalId}/{doctorId}")
	public  ResponseEntity<ResBody<List<NotificationDTO>>> notificationTodoctor(@PathVariable String hospitalId,
			@PathVariable String doctorId){
		return notificationService.notificationToDoctor(hospitalId, doctorId);
	}
	
}