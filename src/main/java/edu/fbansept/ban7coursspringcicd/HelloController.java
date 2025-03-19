package edu.fbansept.ban7coursspringcicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @GetMapping("/")
    public String hello() {
        return "Hello " + jwtSecret;
    }

}
