package com.skywalker.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autz_entity_type")
public class AuthorizationEntity {

    @Id
    @Column(name = "authz_type_id")
    private String authorizationTypeId;

    @Column(name = "auhtz_type_name")
    private String authorizationTypeName;

    @Column(name = "active_fl")
    private boolean activeFlag;

    @Column(name = "del_fl")
    private boolean deleteFlag;

}
