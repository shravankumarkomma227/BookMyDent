package com.dentalcare.doctorservice.controller;

import static com.dentalcare.doctorservice.dermacaredoctorutils.DermaCareUtils.DOCTOR;
import static com.dentalcare.doctorservice.dermacaredoctorutils.DermaCareUtils.LOGIN_DOCTOR;
import static com.dentalcare.doctorservice.dermacaredoctorutils.DermaCareUtils.UPDATE_DOCTOR_AVAILABILITY;
import static com.dentalcare.doctorservice.dermacaredoctorutils.DermaCareUtils.UPDATE_PASSWORD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dentalcare.doctorservice.dto.ChangeDoctorPasswordDTO;
import com.dentalcare.doctorservice.dto.DoctorAvailabilityStatusDTO;
import com.dentalcare.doctorservice.dto.DoctorLoginDTO;
import com.dentalcare.doctorservice.dto.Response;
import com.dentalcare.doctorservice.service.DoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value=DOCTOR)
//@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class DoctorController {
	@Autowired
    private final DoctorService doctorService;

    
    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    @PutMapping(value = UPDATE_PASSWORD)
    public Response updatePassword(@PathVariable String username,
            @RequestBody ChangeDoctorPasswordDTO updatePasswordDTO) {       
    	Response response = doctorService.changePassword(username, updatePasswordDTO);
    	System.out.println(response);
        return response;
   }
    
    
    @PutMapping(value = UPDATE_DOCTOR_AVAILABILITY)
    
    public Response updateDoctorAvailability(@PathVariable String doctorId,@RequestBody  DoctorAvailabilityStatusDTO availabilityDTO) {
    	 
    	return doctorService.updateDoctorAvailability(doctorId, availabilityDTO);
    	
    }
    
    
 //New Apis
    
    @GetMapping("/getAllDoctors")
    public ResponseEntity<?> getAllDoctors(){
    	return doctorService.getAllDoctors();
    }
    
    
    @GetMapping("/getDoctorById/{id}")
    public ResponseEntity<?> getDoctorById(@PathVariable String id){
    	return doctorService.getDoctorById(id);
    }
    
    @GetMapping("/getDoctorByClinicAndDoctorId/{clinicId}/{doctorId}")
    public ResponseEntity<?> getDoctorByClinicAndDoctorId(@PathVariable String clinicId,
    		@PathVariable String doctorId){
    	return doctorService.getDoctorByClinicAndDoctorId(clinicId, doctorId);
    }
    
    
    @GetMapping("/getDoctorsByHospitalById/{clinicId}")
    public ResponseEntity<?> getDoctorsByHospitalById(@PathVariable String clinicId){
    	return doctorService.getDoctorsByHospitalById(clinicId);
    }
    
    
    @GetMapping("/getDoctorsBySubServiceId/{hsptlId}/{subServiceId}")
    public ResponseEntity<?> getDoctorsBySubServiceId(@PathVariable String hsptlId,@PathVariable String subServiceId){
    	return doctorService.getDoctorsBySubServiceId(hsptlId, subServiceId);
    }
    
    
    @GetMapping("/getAllDoctorsBySubServiceId/{subServiceId}")
    public ResponseEntity<?> getAllDoctorsBySubServiceId(@PathVariable String subServiceId){
    	return doctorService.getAllDoctorsBySubServiceId(subServiceId);
    }
    
    @GetMapping("/getDoctorsDeviceId/{doctorId}")
    public ResponseEntity<?> getDoctorDeviceId(@PathVariable String doctorId){
    	return doctorService.getDoctorDeviceId(doctorId);
    }
}
