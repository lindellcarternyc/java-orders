package com.lambda.school.javaorders.repositories;

import com.lambda.school.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
