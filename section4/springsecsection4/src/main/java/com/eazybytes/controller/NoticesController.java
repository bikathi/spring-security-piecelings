package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping(value = "/notices")
    public String getNotices() {
        return "Here are the notice details from the DB";
    }
}
