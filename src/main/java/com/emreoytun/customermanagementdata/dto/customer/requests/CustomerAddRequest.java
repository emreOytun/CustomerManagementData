package com.emreoytun.customermanagementdata.dto.customer.requests;

import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddRequest {

    @NotNull
    @NotBlank
    @Size(min = 5, max = 20)
    private String username;

    @NotNull
    @NotBlank
    private String firstName;

    @NotNull
    @NotBlank
    private String lastName;

    @NotNull
    @NotBlank
    @Size(min = 5, max = 50)
    private String password;

}
