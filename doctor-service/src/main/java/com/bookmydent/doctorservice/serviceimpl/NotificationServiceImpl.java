package com.bookmydent.doctorservice.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.bookmydent.doctorservice.dermacaredoctorutils.AutoCheckJwtToken;
import com.bookmydent.doctorservice.dto.ExtractFeignMessage;
import com.bookmydent.doctorservice.dto.NotificationDTO;
import com.bookmydent.doctorservice.dto.NotificationResponse;
import com.bookmydent.doctorservice.dto.ResBody;
import com.bookmydent.doctorservice.feignclient.NotificationFeign;
import com.bookmydent.doctorservice.service.NotificationService;

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