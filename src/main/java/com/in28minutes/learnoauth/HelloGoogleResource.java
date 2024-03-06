package com.in28minutes.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGoogleResource {
    @GetMapping("/")
    public String helloWorld(Authentication authentication){
        return  /*authentication*/ "HelloGoogleResource";
    }

}
