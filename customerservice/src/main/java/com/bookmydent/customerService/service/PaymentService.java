package com.bookmydent.customerService.service;

import com.bookmydent.customerService.dto.PaymentDTO;
import com.bookmydent.customerService.util.Response;

public interface PaymentService {
    Response createPayment(PaymentDTO paymentDTO);
    Response getAllPayments();
}


