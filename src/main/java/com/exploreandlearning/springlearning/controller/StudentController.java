package com.exploreandlearning.springlearning.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("student")
@CrossOrigin
public class StudentController {

    @GetMapping("/test")
    public ResponseEntity test(@RequestParam String name){
        System.out.println("printing the name "+ name);
        return new ResponseEntity<>("Hello Spring Boot "+ name,HttpStatus.ACCEPTED);
    }

}
