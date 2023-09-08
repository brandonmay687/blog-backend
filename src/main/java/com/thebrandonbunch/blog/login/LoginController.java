package com.thebrandonbunch.blog.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @GetMapping("/{userId}")
    public ResponseEntity<Optional<Login>> getSingleLogin(@PathVariable String userId) {
        return new ResponseEntity<Optional<Login>>(loginService.singleLogin(userId), HttpStatus.OK);
    }
}
