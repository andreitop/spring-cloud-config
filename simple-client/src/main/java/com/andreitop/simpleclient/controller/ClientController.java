package com.andreitop.simpleclient.controller;

import com.andreitop.simpleclient.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/ping")
    public String ping() {
        return appConfig.getFullInfo();
    }
}
