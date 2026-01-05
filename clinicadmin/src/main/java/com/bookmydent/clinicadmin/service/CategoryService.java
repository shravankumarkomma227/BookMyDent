package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.Response;

public interface CategoryService {

	Response getCategoryById(String categoryId);

	Response getAllCategory();

}
