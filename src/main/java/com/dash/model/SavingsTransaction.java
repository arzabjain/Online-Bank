package com.dash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SavingsTransaction {

    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private Double amount;
    private BigDecimal availableBalance;
    private SavingsAccount savingsAccount;
}
