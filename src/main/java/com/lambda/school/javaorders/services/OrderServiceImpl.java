package com.lambda.school.javaorders.services;

import com.lambda.school.javaorders.models.Order;
import com.lambda.school.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
