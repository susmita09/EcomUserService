package com.xyz.ecomuserservice.service;

import com.xyz.ecomuserservice.dtos.UserDto;
import com.xyz.ecomuserservice.model.Role;
import com.xyz.ecomuserservice.model.User;
import com.xyz.ecomuserservice.repository.RoleRepository;
import com.xyz.ecomuserservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public UserDto getUserDetails(Long userId){
      Optional<User> userOptional = userRepository.findById(userId);
       if(userOptional.isEmpty()){
           return null;
       }
       User user = userOptional.get();
       return null;
    }

    public UserDto setUserRoles(Long userId, List<Long> roleIds){
        Optional<User> userOptional = userRepository.findById(userId);
        Set<Role> roles = roleRepository.findAllByIdIn(roleIds);

        if(userOptional.isEmpty()){
            return null;
        }
        User user = userOptional.get();
        user.setRoles(roles);

        User savedUser = userRepository.save(user);
        return null; //return userdto(form)
    }
}
