package com.majbah.dsidemo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String  get(){

        return "Hello";
    }
    @PostMapping(value = "/", consumes ="application/json" ,produces ="application/json" )
    public ResponseEntity<String>  post(@RequestBody String req){

        return ResponseEntity.ok(req);
    }

}
