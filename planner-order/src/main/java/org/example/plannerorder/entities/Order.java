package org.example.plannerorder.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order {
    @GeneratedValue
    @Id
    private String id;
    private String productId;
    private int quantity;
}
