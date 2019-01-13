package com.dash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipient {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String accoundNumber;
    private String description;

    private User user;
}
