package com.example.orders.services;

import com.example.orders.models.Customers;
import com.example.orders.repos.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomersRepository custrepos;
    @Override
    public List<Customers> getCustomers() {
        List<Customers> list = new ArrayList<>();
        custrepos.findAll().iterator().forEachRemaining(list::add);
        return null;
    }

    @Override
    public Customers getCustomerByName(String name) {
        return null;
    }

    @Override
    public Customers save(Customers customer) {
        return null;
    }
}
