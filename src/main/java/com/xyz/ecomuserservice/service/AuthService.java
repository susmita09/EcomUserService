package com.xyz.ecomuserservice.service;

import com.xyz.ecomuserservice.dtos.UserDto;
import com.xyz.ecomuserservice.model.SessionStatus;
import com.xyz.ecomuserservice.repository.RoleRepository;
import com.xyz.ecomuserservice.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService{
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    //constructor injection
    public AuthService(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public ResponseEntity<UserDto> login(String email, String password) {return  null;}
    public ResponseEntity<Void> logOut(String token, Long userId) {return null;}
    public ResponseEntity<UserDto> signUp(String email, String password) {return  null;}
    public SessionStatus validate(String token, Long userId) {return null;}
}
