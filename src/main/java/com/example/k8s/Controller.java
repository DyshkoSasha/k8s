package com.example.k8s;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${result.name}")
    private String name;

    @GetMapping
    public String getName() {
        return name;
    }
}
