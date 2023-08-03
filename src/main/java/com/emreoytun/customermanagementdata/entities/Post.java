package com.emreoytun.customermanagementdata.entities;

import lombok.*;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;

@Entity
@Table(name = "post")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post extends BaseEntity {

    @Id
    @Column(name = "id")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDHexGenerator")
    @GeneratedValue(generator = "uuid")
    private String id;

    @Column(name = "post", nullable = false)
    private String post;

    @Column(name = "price")
    private String description;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
