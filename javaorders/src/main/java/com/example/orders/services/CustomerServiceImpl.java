package com.example.orders.services;

import com.example.orders.models.Customers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {


}
