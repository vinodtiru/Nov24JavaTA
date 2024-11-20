package com.tekarch.sampleservice.Controllers;

import com.tekarch.sampleservice.Account;
import com.tekarch.sampleservice.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/customer")
    public Customer getCustomer(){
        Customer customer = new Customer();
        customer.setName("Vinod");
        customer.setAge(40);

        Account account = new Account();
        account.setAccountNumber("1234ASDWW");
        account.setAccountBalance(2000.40);
        account.setAccountType("CurrentAccount");
        customer.setAccount(account);

//        customer.setAccountNumber();
//        customer.setBalance(2000.40);
        return customer;
    }

    @GetMapping("/balance")
    public String getBalance(){
        return "1200 USD";
    }

    @GetMapping("/account")
    public String getAccount(){
        return "1234ABCDXXXX";
    }
}
