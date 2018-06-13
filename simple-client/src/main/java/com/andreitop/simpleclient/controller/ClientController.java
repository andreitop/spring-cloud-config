package com.andreitop.simpleclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;


@RestController
public class ClientController {

    @Autowired
    private Environment env;

    @GetMapping("/ping")
    public String ping() {
        return "From vault: " + env.getProperty("epam.app") + " | v=" + env.getProperty("epam.version");
    }
}
