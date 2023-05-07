package com.skywalker.user.entity;

import com.skywalker.user.enums.UserIdentifiers;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity implements Serializable, UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "usr_identifier")
    @Enumerated(value = EnumType.STRING)
    private UserIdentifiers userIdentifiers;

    @Column(name = "phone_no", unique = true, nullable = false)
    private String phoneNumber;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "dob")
    private String dob;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "addr_id", referencedColumnName = "addr_id")
    private Set<Address> address = new HashSet<>();

    @Column(name = "crtd_by")
    @CreatedBy
    private String createdBy;

    @Column(name = "crtd_dt")
    @CreatedDate
    private Instant createdDate;

    @Column(name = "uptd_by")
    @LastModifiedBy
    private String lastModifiedBy;

    @Column(name = "uptd_dt")
    @LastModifiedDate
    private Instant lastModifiedDate;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
