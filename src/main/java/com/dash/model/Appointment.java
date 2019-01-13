package com.dash.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

    private Long id;
    private Date date;
    private String location;
    private String description;
    private Boolean confirmed;
    private User user;
}
