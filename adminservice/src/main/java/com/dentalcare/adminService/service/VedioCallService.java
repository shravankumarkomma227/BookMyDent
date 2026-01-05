package com.dentalcare.adminService.service;

import com.dentalcare.adminService.dto.VedioCallDTO;
import com.dentalcare.adminService.util.Response;

public interface VedioCallService {
Response addVedioCallCredential(VedioCallDTO dto);
Response getCredentials();
}