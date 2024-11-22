package com.tekarch.customerms.Repositories;

import com.tekarch.customerms.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
