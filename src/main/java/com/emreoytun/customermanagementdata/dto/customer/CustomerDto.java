package com.emreoytun.customermanagementdata.dto.customer;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

    private int id;
    private String username;
    private String firstName;
    private String lastName;
}


