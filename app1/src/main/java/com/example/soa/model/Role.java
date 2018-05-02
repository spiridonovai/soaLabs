package com.example.soa.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    public String role_name;

    @OneToMany
    public List<User> users;

    public Role() {

    }

    public Role(String role_name) {
        this.role_name = role_name;
    }
}
