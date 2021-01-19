package com.majbah.dsidemo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class WelcomeController {

    Logger log = Logger.getLogger(WelcomeController.class.getName());

    @GetMapping("/")
    public String  get(){

        return "Hello";
    }
    @PostMapping(value = "/" )
    public ResponseEntity post(@RequestBody String req){
        log.info(req);
        return  ResponseEntity.status(HttpStatus.OK).body("ok");
    }

}
