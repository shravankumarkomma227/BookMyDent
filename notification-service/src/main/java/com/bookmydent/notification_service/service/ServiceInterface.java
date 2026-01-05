package com.bookmydent.notification_service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bookmydent.notification_service.dto.BookingResponse;
import com.bookmydent.notification_service.dto.NotificationDTO;
import com.bookmydent.notification_service.dto.NotificationResponse;
import com.bookmydent.notification_service.dto.NotificationToCustomer;
import com.bookmydent.notification_service.dto.ResBody;


public interface ServiceInterface {

	public void createNotification(BookingResponse booking);

	public ResBody<List<NotificationDTO>> notificationtodoctor( String hospitalId,
			 String doctorId);

    ResBody<List<NotificationDTO>> sendNotificationToClinic(String clinicId);

    ResBody<NotificationDTO> notificationResponse(NotificationResponse notificationResponse);

    NotificationDTO getNotificationByBookingId(String bookingId);

    NotificationDTO updateNotification(NotificationDTO notificationDTO);

    public ResponseEntity<ResBody<List<NotificationToCustomer>>> notificationToCustomer(
			 String customerMobileNumber);
    
    public void sendAlertNotifications();
}
