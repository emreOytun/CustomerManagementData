package com.emreoytun.customermanagementdata.dto.customer.responses;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerGetResponse {

    private int id;
    private String userName;
    private String firstName;
    private String lastName;
}


