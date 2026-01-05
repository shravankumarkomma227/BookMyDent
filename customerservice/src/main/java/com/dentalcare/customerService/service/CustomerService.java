package com.dentalcare.customerService.service;

import java.util.List;
import org.springframework.http.ResponseEntity;

import com.dentalcare.customerService.dto.BookingRequset;
import com.dentalcare.customerService.dto.BookingResponse;
import com.dentalcare.customerService.dto.ConsultationDTO;
import com.dentalcare.customerService.dto.CustomerDTO;
import com.dentalcare.customerService.dto.CustomerRatingDomain;
import com.dentalcare.customerService.dto.FavouriteDoctorsDTO;
import com.dentalcare.customerService.dto.LoginDTO;
import com.dentalcare.customerService.dto.NotificationToCustomer;
import com.dentalcare.customerService.dto.ResponseDTO;
import com.dentalcare.customerService.util.ResBody;
import com.dentalcare.customerService.util.Response;
import com.dentalcare.customerService.util.ResponseStructure;
import com.fasterxml.jackson.core.JsonProcessingException;

import jakarta.servlet.http.HttpSession;


public interface CustomerService {

	 	 
	  public Response saveCustomerBasicDetails(CustomerDTO customerDTO);
	 
	  public Response getCustomerByMobileNumber(String mblnumber);
	 
	  public Response getAllCustomers();
	 
	  public Response updateCustomerBasicDetails( CustomerDTO customerDTO ,String mobileNumber) ;
	 
	  public Response deleteCustomerByMobileNumber(String mobileNumber);
	 
	  public CustomerDTO getCustomerDetailsByMobileNumber(String mobileNumber);
	
	  public CustomerDTO getCustomerDetailsByEmail(String email);
	
	  public List<CustomerDTO> getCustomerByfullName(String fullName);
    
      public Response saveConsultation(ConsultationDTO dto) ;
    
      public Response getAllConsultations();
	
    //BOOKING MANAGENET
    
    public Response bookService(BookingRequset req) throws JsonProcessingException ;
    
    public Response deleteBookedService(String id);
    
    public Response getBookedService(String id);
    
    public Response getCustomerBookedServices(
	    	String mobileNumber);
    
    public ResponseStructure<List<BookingResponse>> getAllBookedServices();
    
    public Response getBookingByDoctorId(String doctorId);
    
    public Response getBookingByServiceId(String serviceId);
    
    public Response getBookingByClinicId(String clinicId);
    
    ///  DOCTOR APIS
    
    public Response getDoctors(String cid, String serviceId);
    
    public ResponseEntity<Response> saveFavouriteDoctors(FavouriteDoctorsDTO favouriteDoctorsDTO);
    
    public Response getDoctorsSlots(String hospitalId,String doctorId);
    
    public Response getAllSavedFavouriteDoctors();
   
    
   // RATING APPOINTMENT
    public Response submitCustomerRating(CustomerRatingDomain ratingRequest);
    
    public Response getRatingForService(String hospitalId,String branchId, String doctorId);
    
    public Response getAverageRating(String hospitalId, String doctorId);
    
    // SUBSERVICE
    public Response getSubServiceInfoBySubServiceId(String subServiceId) throws JsonProcessingException ;
    
    //DOCTORINFOBYSUBSERVICEID
    public Response getDoctorsandHospitalDetails(String hospitalId, String subServiceId)throws JsonProcessingException;
    
    //DetailsBySubServiceIdAndConsultationType
    public Response getHospitalsAndDoctorsDetailsBySubServiceId(String subServiceId);
    
    //Services
    public Response getServiceById( String categoryId);
	public Response getSubServicesByServiceId(String serviceId);
	public Response getAllCategory();
	
	//NOTIFICATION
	public ResponseEntity<ResBody<List<NotificationToCustomer>>> notificationToCustomer(
			 String customerMobileNumber);

	
	//BOOKING API
	public ResponseEntity<?> getInProgressAppointments( String mnumber,String patientId);
}
