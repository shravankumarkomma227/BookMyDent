package com.dentalcare.customerService.service;

import com.dentalcare.customerService.dto.PaymentDTO;
import com.dentalcare.customerService.util.Response;

public interface PaymentService {
    Response createPayment(PaymentDTO paymentDTO);
    Response getAllPayments();
}


