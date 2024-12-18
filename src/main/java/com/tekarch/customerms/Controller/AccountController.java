package com.tekarch.customerms.Controller;

import com.tekarch.customerms.Models.Account;
import com.tekarch.customerms.Services.AccountServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountController {
    private final AccountServiceImpl accountService;

    @GetMapping("/account")
    public List<Account> getAccounts(){
        return accountService.getAllAccounts();
    }

    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }

    @ExceptionHandler
    public ResponseEntity<?> respondWithError(Exception e){
        return new ResponseEntity<>("Exception Occurred. More Info :"
                + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
