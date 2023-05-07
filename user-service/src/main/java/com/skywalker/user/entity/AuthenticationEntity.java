package com.skywalker.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.Instant;
import java.util.Collection;

@Entity
@Table(name = "autz_info")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_id")
    private String authenticationId;

    @Column(name = "password")
    private String password;

    @Column(name = "authz_type_id")
    private  String authorizationTypeId;

    @Column(name = "crtd_by")
    private String createdBy;

    @Column(name = "crtd_dt")
    private Instant createdDate;

    @Column(name = "uptd_by")
    private String lastModifiedBy;

    @Column(name = "uptd_dt")
    private Instant lastModifiedDate;


}
