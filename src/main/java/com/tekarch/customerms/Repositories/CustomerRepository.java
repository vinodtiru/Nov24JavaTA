package com.tekarch.customerms.Repositories;


import com.tekarch.customerms.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
