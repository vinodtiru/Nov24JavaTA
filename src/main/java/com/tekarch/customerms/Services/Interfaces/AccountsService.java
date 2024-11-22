package com.tekarch.customerms.Services.Interfaces;


import com.tekarch.customerms.Models.Account;

import java.util.List;

public interface AccountsService {
    Account addAccount(Account account);
    List<Account> getAllAccounts();
}
