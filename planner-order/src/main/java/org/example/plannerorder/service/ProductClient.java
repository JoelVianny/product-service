package org.example.plannerorder.service;

import org.example.plannerproduct.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "planner-product")
public interface ProductClient {
    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable String id);
}
