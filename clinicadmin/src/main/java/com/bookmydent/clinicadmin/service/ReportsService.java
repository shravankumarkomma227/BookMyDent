package com.bookmydent.clinicadmin.service;

import org.springframework.stereotype.Service;

import com.bookmydent.clinicadmin.dto.ReportsDTO;
import com.bookmydent.clinicadmin.dto.ReportsDtoList;
import com.bookmydent.clinicadmin.dto.Response;

@Service
public interface ReportsService {

	Response saveReports(ReportsDtoList dto);

	Response getAllReports();

	Response getReportsByBookingId(String bookingId);

}
