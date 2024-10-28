package com.ejercicio.retail.repository;

import com.ejercicio.retail.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}