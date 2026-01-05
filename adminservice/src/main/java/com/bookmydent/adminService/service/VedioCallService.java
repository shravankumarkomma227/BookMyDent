package com.bookmydent.adminService.service;

import com.bookmydent.adminService.dto.VedioCallDTO;
import com.bookmydent.adminService.util.Response;

public interface VedioCallService {
Response addVedioCallCredential(VedioCallDTO dto);
Response getCredentials();
}