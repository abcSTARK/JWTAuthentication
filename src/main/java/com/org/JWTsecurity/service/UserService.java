package com.org.JWTsecurity.service;

import com.org.JWTsecurity.dto.User;
import com.org.JWTsecurity.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUserService(){
        return userRepository.findAll();
    }
}
