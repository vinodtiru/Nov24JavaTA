package com.tekarch.customerms.Services.Interfaces;

import com.tekarch.customerms.Models.Customer;

import java.util.List;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
