package com.org.JWTsecurity.controller;

import com.org.JWTsecurity.dto.LoginResponse;
import com.org.JWTsecurity.dto.LoginUserDto;
import com.org.JWTsecurity.dto.RegisterUserDto;
import com.org.JWTsecurity.dto.User;

import com.org.JWTsecurity.service.AuthenticationService;
import com.org.JWTsecurity.service.JwtService;
import com.org.JWTsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/auth")
@RestController
public class JwtController {

    @Autowired
    UserService userService;

    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public JwtController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }
    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody RegisterUserDto registerUserDto) {
        User registeredUser = authenticationService.signup(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken(jwtToken);
        loginResponse.setExpiresIn(jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }


    @GetMapping("/me")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public ResponseEntity<User> authenticatedUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        User currentUser = (User) authentication.getPrincipal();

        return ResponseEntity.ok(currentUser);
    }
    @GetMapping("/getUserDetails")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public List<User> getUserDetails(){
        return userService.getUserService();
    }

    @GetMapping("/getUserDetailsAdmin")
    public List<User> getUserDetailsAdmin(){
        return userService.getUserService();
    }

    @GetMapping("/user/userProfile")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String userProfile() {
        return "Welcome to User Profile";
    }

    @GetMapping("/admin/adminProfile")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String adminProfile() {
        return "Welcome to Admin Profile";
    }
}
