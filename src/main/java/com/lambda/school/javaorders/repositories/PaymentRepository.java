package com.lambda.school.javaorders.repositories;

import com.lambda.school.javaorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
