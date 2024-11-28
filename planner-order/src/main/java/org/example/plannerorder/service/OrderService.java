package org.example.plannerorder.service;

import lombok.RequiredArgsConstructor;
import org.example.plannerorder.entities.Order;
import org.example.plannerorder.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }


}
