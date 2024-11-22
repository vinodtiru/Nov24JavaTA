package com.tekarch.customerms.Services;

import com.tekarch.customerms.Models.Account;
import com.tekarch.customerms.Repositories.AccountRepository;
import com.tekarch.customerms.Services.Interfaces.AccountsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountsService {
    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
