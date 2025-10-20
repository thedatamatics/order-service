package com.myorg.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Properties;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping("/ping")
    public String ping(){
        StringBuilder sb = new StringBuilder();
        Properties properties = System.getProperties();
//        for (String s : properties.stringPropertyNames())
//            sb.append(s).append(":").append(properties.getProperty(s)).append("\n");
//
//
//        return sb.toString();
        ZoneId zone = ZonedDateTime.now().getZone();

        return "PONG "+ zone.getId();
    }
}
