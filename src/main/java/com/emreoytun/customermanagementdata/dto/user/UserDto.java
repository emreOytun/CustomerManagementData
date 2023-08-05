package com.emreoytun.customermanagementdata.dto.user;

import com.emreoytun.customermanagementdata.dto.role.RoleDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class UserDto implements Serializable {
    private int id;
    private String username;
    private String password;
    private Set<RoleDto> roles;

}
