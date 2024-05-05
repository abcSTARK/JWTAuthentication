package com.org.JWTsecurity.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserDto {
    private String email;

    private String password;

    private String name;

    private String profile;
}
