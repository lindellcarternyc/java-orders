package com.lambda.school.javaorders.repositories;

import com.lambda.school.javaorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
