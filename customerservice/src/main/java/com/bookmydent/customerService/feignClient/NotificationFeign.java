package com.bookmydent.customerService.feignClient;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import com.bookmydent.customerService.dto.NotificationToCustomer;
import com.bookmydent.customerService.util.ResBody;
import com.bookmydent.customerService.util.Response;

import feign.FeignException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@FeignClient(value = "notification-service" )
@CircuitBreaker(name = "circuitBreaker", fallbackMethod = "clinicAdminServiceFallBack")
public interface NotificationFeign {
	
	@GetMapping("/api/notificationservice/customerNotification/{customerMobileNumber}")
	public ResponseEntity<ResBody<List<NotificationToCustomer>>> customerNotification(
			@RequestHeader("Authorization") String token,@PathVariable String customerMobileNumber);
	
	
	//FALLBACK METHOD
	
	default ResponseEntity<?> clinicAdminServiceFallBack(FeignException e){		 
		return ResponseEntity.status(e.status()).body(new Response(e.getMessage(),e.status(),false,null));}
	
}
