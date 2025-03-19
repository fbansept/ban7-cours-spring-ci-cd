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

    @Value("${environment.name}")
    private String environment;

    @GetMapping("/")
    public String hello() {
        return "Hello secret : '" + jwtSecret + "' from '" + environment + "' environment";
    }

}
