package com.xyz.ecomuserservice.service;

import com.xyz.ecomuserservice.model.Role;
import com.xyz.ecomuserservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    public Role createRole(String roleName) {
        Role role = new Role();
        role.setRole(roleName);


        return roleRepository.save(role);
    }

}
