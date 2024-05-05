package com.org.JWTsecurity.repository;

import com.org.JWTsecurity.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByName(String name);



}
