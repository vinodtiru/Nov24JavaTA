package com.tekarch.customerms.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    private String accountType;
    private Double minBalance;
    private Double balance;
}
