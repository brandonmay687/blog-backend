package com.thebrandonbunch.blog.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
    public Optional<Login> singleLogin(String userId) {
        return loginRepository.findLoginById(userId);
    }
}
