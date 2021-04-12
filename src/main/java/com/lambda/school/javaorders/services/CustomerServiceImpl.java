package com.lambda.school.javaorders.services;

import com.lambda.school.javaorders.models.Customer;
import com.lambda.school.javaorders.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
