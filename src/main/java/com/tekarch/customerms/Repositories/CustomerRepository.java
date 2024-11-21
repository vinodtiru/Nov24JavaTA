package com.tekarch.customerms.Repositories;

import com.tekarch.customerms.Models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private final ArrayList<Customer> customers = new ArrayList<>();

    public Customer save(Customer customer){
        customers.add(customer);
        return customer;
    }

    public List<Customer> findAll(){
        return customers;
    }

    public Customer getCustomerById(Long id) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId().equals(id)) {
                return customers.get(i);
            }
        }
        return null;
    }
}
