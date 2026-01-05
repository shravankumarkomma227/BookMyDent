// DoctorPrescriptionService.java
package com.dentalcare.doctorservice.service;

import com.dentalcare.doctorservice.dto.DoctorPrescriptionDTO;
import com.dentalcare.doctorservice.dto.Response;

public interface DoctorPrescriptionService {
    Response createPrescription(DoctorPrescriptionDTO dto);
    Response getAllPrescriptions();
    Response getPrescriptionById(String id);
    Response getMedicineById(String medicineId);
    Response deletePrescription(String id);
    Response searchMedicinesByName(String keyword);
    Response deleteMedicineById(String medicineId);
    Response getPrescriptionsByClinicId(String clinicId);

}
