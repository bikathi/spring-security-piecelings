package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping(value = "/myBalance")
    public String getBalancDetails() {
        return "Here are the balance details from the DB";
    }
}
