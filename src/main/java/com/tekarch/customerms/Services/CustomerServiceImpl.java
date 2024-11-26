package com.tekarch.customerms.Services;

import com.tekarch.customerms.Models.Customer;
import com.tekarch.customerms.Repositories.CustomerRepository;
import com.tekarch.customerms.Services.Interfaces.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private static final Logger logger = LogManager.getLogger(CustomerServiceImpl.class);

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(Customer customer) {
        System.out.println("New request to add customer ");
        logger.info("New request to add customer and i am logging it");
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
