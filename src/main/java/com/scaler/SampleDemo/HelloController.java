package com.scaler.SampleDemo;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity HelloWorld(){
        //String hello = "Hello World";
        Person person = new Person("aavishkar", 44, "welcome to spring boot");
        return ResponseEntity.ok(person);
    }
}
