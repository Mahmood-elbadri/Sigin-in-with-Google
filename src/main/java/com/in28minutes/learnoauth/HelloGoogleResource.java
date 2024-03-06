package com.in28minutes.learnoauth;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGoogleResource {
    @GetMapping("/")
    public Authentication helloWorld(Authentication authentication){
        return  authentication;
    }

}
