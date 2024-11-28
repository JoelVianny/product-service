package org.example.plannerorder.repository;

import org.example.plannerorder.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order , String> {
}
