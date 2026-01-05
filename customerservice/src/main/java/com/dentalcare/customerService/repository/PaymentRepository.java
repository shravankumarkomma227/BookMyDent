package com.dentalcare.customerService.repository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.customerService.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    boolean existsByTransactionId(String transactionId);
}



