package com.dash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavingsAccount {

    private Long id;
    private Long accountNumber;
    private BigDecimal accountBalance;

    private List<SavingsTransaction> savingsTransactionList;
}
