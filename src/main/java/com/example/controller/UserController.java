package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
@GetMapping(value="/thik")
public ResponseEntity<String> testApi() throws Exception {
    
    return new ResponseEntity<>("sab thik hain.Kaam kro", HttpStatus.OK);
}

}
