package com.tekarch.customerms.Controller;

import com.tekarch.customerms.Models.Customer;
import com.tekarch.customerms.Services.CustomerServiceImpl;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerServiceImpl customerServiceImpl;

    public CustomerController(CustomerServiceImpl customerServiceImpl) {
        this.customerServiceImpl = customerServiceImpl;
    }

    @GetMapping("/customer")
    public List<Customer> getCustomer(){
        return customerServiceImpl.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerServiceImpl.getCustomerById(id);
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerServiceImpl.addCustomer(customer);
    }
}
