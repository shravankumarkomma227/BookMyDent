package com.bookmydent.customerService.repository;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.customerService.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {

    boolean existsByTransactionId(String transactionId);
}



