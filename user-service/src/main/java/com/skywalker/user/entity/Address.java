package com.skywalker.user.entity;

import lombok.*;
import org.apache.kafka.common.annotation.InterfaceStability;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addr_id")
    private Long addressId;

    @Column(name = "addr_line_1")
    private String addressLine1;

    @Column(name = "addr_line_1")
    private String addressLine2;

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "district")
    private String district;

    @Column(name = "state")
    private String state;

    @Column(name = "pincode")
    private String pincode;

    @Column(name = "country")
    private String country;

    @Column(name = "crtd_by")
    private String createdBy;

    @Column(name = "crtd_dt")
    private Instant createdDate;

    @Column(name = "uptd_by")
    private String lastModifiedBy;

    @Column(name = "uptd_dt")
    private Instant lastModifiedDate;

}
