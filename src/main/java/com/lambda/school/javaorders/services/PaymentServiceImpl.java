package com.lambda.school.javaorders.services;

import com.lambda.school.javaorders.models.Payment;
import com.lambda.school.javaorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "paymentService")
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    @Override
    public Payment save(Payment payment) {
        return paymentRepository.save(payment);
    }
}
