package com.dentalcare.category_services.service;

import com.dentalcare.category_services.dto.SubServicesInfoDto;
import com.dentalcare.category_services.util.Response;

public interface SubServiceInfo {
	
	 Response addSubService(SubServicesInfoDto dto);

	    Response getSubServiceByIdCategory(String categoryId);

	    Response getSubServicesByServiceId(String serviceId);

	    Response getSubServiceBySubServiceId(String subServiceId);

	    Response deleteSubService(String subServiceId);

	    Response updateBySubServiceId(String subServiceId, SubServicesInfoDto domainServices);

	    Response getAllSubServices();

}
