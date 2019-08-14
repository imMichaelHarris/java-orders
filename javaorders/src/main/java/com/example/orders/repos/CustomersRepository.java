package com.example.orders.repos;

import com.example.orders.models.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long> {
}
