package com.bookmydent.clinicadmin.service;

import com.bookmydent.clinicadmin.dto.IncidentDTO;
import com.bookmydent.clinicadmin.dto.Response;

public interface IncidentService {
 Response createIncident(IncidentDTO dto);
 Response getAllIncidents();
 Response UpdateIncidentStatu(String id, String status);
 Response deleteIncident(String id);
}
