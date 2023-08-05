package com.emreoytun.customermanagementdata.dto.role;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class RoleDto implements Serializable {
    private int id;
    private String name;
}
