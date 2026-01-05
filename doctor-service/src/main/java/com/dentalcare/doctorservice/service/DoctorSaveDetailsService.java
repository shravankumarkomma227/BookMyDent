package com.dentalcare.doctorservice.service;

import com.dentalcare.doctorservice.dto.DoctorSaveDetailsDTO;
import com.dentalcare.doctorservice.dto.Response;

public interface DoctorSaveDetailsService {

    Response saveDoctorDetails(DoctorSaveDetailsDTO dto);

    Response getDoctorDetailsById(String id);

    Response updateDoctorDetails(String id, DoctorSaveDetailsDTO dto);

    Response deleteDoctorDetails(String id);

    Response getAllDoctorDetails();

	Response getVisitHistoryByPatientAndBooking(String patientId, String bookingId);

//	Response getRevisitPrescriptions(String patientId, String bookingId);
	Response getVisitHistoryByPatient(String patientId);

	Response getVisitHistoryByPatientAndDoctor(String patientId, String doctorId);

}
