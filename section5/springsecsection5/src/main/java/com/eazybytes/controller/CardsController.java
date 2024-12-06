package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping(value = "/myCards")
    public String getCarsDetails() {
        return "Here are the card details from the DB";
    }
}