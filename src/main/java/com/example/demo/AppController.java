package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


//    @GetMapping("/login")
//    public String getLoginPage() {
//        return "HELLO FROM LOGIN";
//    }

    @GetMapping("/")
    public String getHomePage() {
        return "HELLO FROM HOME PAGE";
    }

    @GetMapping("/logout")
    public String getLogoutPage() {
        return "HELLO FROM LOGOUT PAGE";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        return "" +
                "HELLO FROM ADMIN PAGE {}" +
                "Name = " + authentication.getName() +
                "Password = " + authentication.getCredentials() +
                "Details = " + authentication.getDetails()+
                "Principal = " + authentication.getPrincipal();
    }
}
