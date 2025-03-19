package edu.fbansept.ban7coursspringcicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
public class HelloController {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Value("${environment.name}")
    private String environment;

    @Value("${upload.folder}")
    private String uploadFolder;

    @GetMapping("/")
    public Map<String,Object> hello() {

        return Map.of(
                "Secret : " , jwtSecret , //remplacé par github action
                "Environment : ", environment, //remplacé par la variable ENVIRONMENT du fichier .env
                "Upload folder : " , uploadFolder); //remplacé par la variable UPLOAD_FOLDER du fichier .local.env
    }

}
