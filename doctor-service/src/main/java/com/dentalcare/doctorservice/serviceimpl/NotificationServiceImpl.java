package com.dentalcare.doctorservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.dentalcare.doctorservice.dermacaredoctorutils.AutoCheckJwtToken;
import com.dentalcare.doctorservice.dto.ExtractFeignMessage;
import com.dentalcare.doctorservice.dto.NotificationDTO;
import com.dentalcare.doctorservice.dto.NotificationResponse;
import com.dentalcare.doctorservice.dto.ResBody;
import com.dentalcare.doctorservice.feignclient.NotificationFeign;
import com.dentalcare.doctorservice.service.NotificationService;

import feign.FeignException;

@Service
public class NotificationServiceImpl implements NotificationService {
	
	@Autowired
	private NotificationFeign notificationFeign;
		
	
	  @Autowired
	  private AutoCheckJwtToken token;
	   	

	public ResponseEntity<ResBody<List<NotificationDTO>>> notificationToDoctor(String hospitalId,
			 String doctorId){
		try {
			//System.out.println(jwtToken);
			//System.out.println(expireTime);
		return notificationFeign.notificationtodoctor(token.access_token, hospitalId, doctorId);
		}catch(FeignException e) {
			ResBody<List<NotificationDTO>> res = new ResBody<List<NotificationDTO>>(ExtractFeignMessage.clearMessage(e),e.status(),null);
			return ResponseEntity.status(e.status()).body(res);}
		}
		
}