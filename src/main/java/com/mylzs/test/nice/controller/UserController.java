package com.mylzs.test.nice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
@RequestMapping("/index")
 public String index(){
     return "ncie-jinlaile";
 }

}
