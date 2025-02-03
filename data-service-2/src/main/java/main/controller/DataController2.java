package main.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController1 {

    @GetMapping("/data")
    public String getData() {
        return "Data from Service 1";
    }
}