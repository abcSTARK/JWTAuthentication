package com.org.JWTsecurity.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginUserDto {

    private String name;

    private String password;
}
