package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping(value = "/myLoans")
    public String getLoanDetails() {
        return "Here are the loan details from the DB";
    }
}
