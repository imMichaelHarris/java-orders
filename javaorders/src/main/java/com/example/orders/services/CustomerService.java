package com.example.orders.services;

import com.example.orders.models.Customers;

import java.util.List;

public interface CustomerService {
    List<Customers> getCustomers();

    Customers getCustomerByName(String name);

    Customers save(Customers customer);
}
