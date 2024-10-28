package com.ejercicio.retail.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

import com.ejercicio.retail.model.Order;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity(name = "Customer")
@Table(name = "customer")
@Getter
@NoArgsConstructor
public class Customer {
    @Id
    @SequenceGenerator(
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private String address;

    @OneToMany(
            orphanRemoval = true,
            mappedBy = "customer",
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE}
    )
    private List<Order> orders;
}
