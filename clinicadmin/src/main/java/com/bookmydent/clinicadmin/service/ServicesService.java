package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.Response;

public interface ServicesService {

	public Response getServiceById(String categoryId);

	public Response getServiceByServiceId(String serviceId);

	public Response getAllServices();
}
