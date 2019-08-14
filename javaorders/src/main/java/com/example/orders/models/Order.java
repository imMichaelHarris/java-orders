package com.example.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;
    private double ordamount;
    private double advanceamount;
    private String orddescription;

    @ManyToOne
    @JoinColumn(name = "custcode")
    @JsonIgnoreProperties("customers")
    private List<Customer> customers = new ArrayList<>();
}
