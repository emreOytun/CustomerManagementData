package com.emreoytun.customermanagementdata.dto.authentication.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {

    @NotNull
    @NotBlank
    private String username;

    @NotNull
    @NotBlank
    private String password;
}
