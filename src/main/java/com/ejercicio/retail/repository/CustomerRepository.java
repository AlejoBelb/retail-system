package com.ejercicio.retail.repository;

import com.ejercicio.retail.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}