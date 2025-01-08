package com.xyz.ecomuserservice.repository;

import com.xyz.ecomuserservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Set<Role> findAllByIdIn(List<Long> roleIds);
}
