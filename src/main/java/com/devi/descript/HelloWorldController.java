package com.devi.descript;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController           //a controller needs an anotation
public class HelloWorldController {


    @GetMapping(path = "/hello")   //--> this is describes this is an endpoint --> Whenever we hit /hello it will give us hello world
    public String helloWorld(){


        return "Subah Subah Bhakchodi na kare, time pe office jaye";
    }
}
