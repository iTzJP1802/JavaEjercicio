package com.upc.javaejercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "javaejercicio.azurewebsites.net")
public class JavaEjercicioApplication {

    @GetMapping("/prueba")
    public String mensaje(){
        return "Si Funciona";
    }
    public static void main(String[] args) {
        SpringApplication.run(JavaEjercicioApplication.class, args);
    }

}
