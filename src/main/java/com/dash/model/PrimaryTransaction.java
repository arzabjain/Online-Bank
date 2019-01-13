package com.dash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrimaryTransaction {

    private Long id;
    private Date date;
    private String description;
    private String type;
    private String status;
    private Double amount;
    private BigDecimal availableBalance;
    private PrimaryAccount primaryAccount;
}
