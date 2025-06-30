package com.example.monitoring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class MonitoringController {

    @GetMapping(value = "/")
    public String checkMonitoring() {
        return "chckMonitoring!";
    }

    @GetMapping("/api/monitoring")
    public String getMonitoring() {
        return "getMonitoring!";
    }
}
