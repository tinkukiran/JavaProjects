package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

@GetMapping("/api/health-check")
    public String healthCheck() {
        return "Ok";
    }
}
