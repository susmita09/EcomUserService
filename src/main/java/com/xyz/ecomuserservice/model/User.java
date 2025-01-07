package com.xyz.ecomuserservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class User extends BaseModel {
    private String username;
    private String password;
    private String email;

    @ManyToMany
    private Set<Role> roles = new HashSet<>();
}
