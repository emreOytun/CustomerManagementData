package com.emreoytun.customermanagementdata.dto.post;

import com.emreoytun.customermanagementdata.entities.Customer;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private String id;
    private String post;
    private String description;
    private int customerId;
}
