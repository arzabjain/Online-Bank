package com.dash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long userId;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Boolean enabled = true;

    private PrimaryAccount primaryAccount;
    private SavingsAccount savingsAccount;

    private List<Appointment> appointmentList;
    private List<Recipient> recipientList;
}
