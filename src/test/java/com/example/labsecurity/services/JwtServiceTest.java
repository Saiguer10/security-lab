package com.example.labsecurity.services;

import com.example.labsecurity.repositories.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JwtServiceTest {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JwtService jwtService;

    @Test
    @DisplayName("Genera un token correctamente")
    void generateToken() {
        String token = jwtService.generateToken("John", "[ROLE_ADMIN]");

        System.out.println("ESTO ES EL TOKEN: " + token);
    }
}
