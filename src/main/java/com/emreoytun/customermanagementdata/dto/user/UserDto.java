package com.emreoytun.customermanagementdata.dto.user;

import com.emreoytun.customermanagementdata.dto.role.RoleDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserDto {
    private int id;
    private String username;
    private String password;
    private Set<RoleDto> roles;

}
