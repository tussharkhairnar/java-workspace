package com.springboot.email.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.email.service.FoodMenuService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menu")
public class MenuController {

    private final FoodMenuService foodMenuService;

    public MenuController(FoodMenuService foodMenuService) {
        this.foodMenuService = foodMenuService;
    }

    @GetMapping(path = "")
    public ResponseEntity<List<String>> getMenu() {
        List<String> sushi = foodMenuService.getSushi();
        return new ResponseEntity<>(sushi, HttpStatus.OK);
    }
}



//https://www.rajith.me/2020/10/rest-api-localization-using-spring-boot.html