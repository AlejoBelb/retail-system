package com.ejercicio.retail.repository;

import com.ejercicio.retail.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}