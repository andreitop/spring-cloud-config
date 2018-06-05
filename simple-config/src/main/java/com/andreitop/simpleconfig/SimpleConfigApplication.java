package com.andreitop.simpleconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SimpleConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleConfigApplication.class, args);
    }
}
