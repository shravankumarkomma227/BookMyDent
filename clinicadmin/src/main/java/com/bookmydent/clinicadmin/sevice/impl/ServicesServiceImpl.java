package com.bookmydent.clinicadmin.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bookmydent.clinicadmin.dto.Response;
import com.bookmydent.clinicadmin.dto.ResponseStructure;
import com.bookmydent.clinicadmin.dto.ServicesDto;
import com.bookmydent.clinicadmin.feignclient.ServiceFeignClient;
import com.bookmydent.clinicadmin.service.ServicesService;
import com.bookmydent.clinicadmin.utils.AutoCheckJwtToken;
import com.bookmydent.clinicadmin.utils.ExtractFeignMessage;

import feign.FeignException;


@Service
public class ServicesServiceImpl implements ServicesService{

	@Autowired
	ServiceFeignClient serviceFeignClient;
	
	 @Autowired
	 private AutoCheckJwtToken token;
		
	
	@Override
	public Response getServiceById(String categoryId) {
	    Response response = new Response();
	    try {
	        ResponseEntity<ResponseStructure<List<ServicesDto>>> res = serviceFeignClient.getServiceById(token.access_token,categoryId);
	        if (res.hasBody() && res.getBody() != null) {
	            ResponseStructure<List<ServicesDto>> rsBody = res.getBody();
	            response.setSuccess(true);
	            response.setData(rsBody.getData());
	            response.setMessage(rsBody.getMessage());
	            response.setStatus(200);
	        }
	    } catch (FeignException e) {
	        response.setSuccess(false);
	        response.setMessage(ExtractFeignMessage.clearMessage(e));
	        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//	        e.printStackTrace();
	    }
	    return response;
	}


	@Override
	public Response getServiceByServiceId(String serviceId) {
		Response response = new Response();
	    try {
	    	ResponseEntity<ResponseStructure<ServicesDto>> res = serviceFeignClient.getServiceByServiceId(token.access_token,serviceId);
	        if (res.hasBody() && res.getBody() != null) {
	            ResponseStructure<ServicesDto> rsBody = res.getBody();
	            response.setSuccess(true);
	            response.setData(rsBody.getData());
	            response.setMessage(rsBody.getMessage());
	            response.setStatus(200);
	        }
	    } catch (FeignException e) {
	        response.setSuccess(false);
	        response.setMessage(ExtractFeignMessage.clearMessage(e));
	        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//	        e.printStackTrace();
	    }
	    return response;
	}

	@Override
	public Response getAllServices() {
		Response response = new Response();
	    try {
	        ResponseEntity<ResponseStructure<List<ServicesDto>>> res = serviceFeignClient.getAllServices(token.access_token);
	        if (res.hasBody() && res.getBody() != null) {
	            ResponseStructure<List<ServicesDto>> rsBody = res.getBody();
	            response.setSuccess(true);
	            response.setData(rsBody.getData());
	            response.setMessage(rsBody.getMessage());
	            response.setStatus(200);	
	        }
	    } catch (FeignException e) {
	        response.setSuccess(false);
	        response.setMessage(ExtractFeignMessage.clearMessage(e));
	        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
//	        e.printStackTrace();
	    }
	    return response;
	}

}
