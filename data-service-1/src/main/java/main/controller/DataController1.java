package main.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DataController2 {

    private final Random random = new Random();

    @GetMapping("/data")
    public String getData() {
        if (random.nextBoolean()) {
            throw new RuntimeException("Service 2 failure");
        }
        return "Data from Service 2";
    }
}