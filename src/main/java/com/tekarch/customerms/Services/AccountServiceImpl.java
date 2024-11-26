package com.tekarch.customerms.Services;

import com.tekarch.customerms.Models.Account;
import com.tekarch.customerms.Repositories.AccountRepository;
import com.tekarch.customerms.Services.Interfaces.AccountsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountsService {
    private static final Logger logger = LogManager.getLogger(AccountServiceImpl.class);

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account addAccount(Account account) {
        logger.info("New request to add Account"); //common
        logger.trace("New request to add Account");
        logger.error("New request to add Account with number  {} with balance {}. There was a error",
                account.getAccountType(), account.getBalance()); //always
        logger.debug("New request to add Account"); //sometimes
        logger.warn("New request to add Account");
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
