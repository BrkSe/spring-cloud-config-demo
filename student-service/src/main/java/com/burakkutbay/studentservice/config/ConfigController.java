package com.burakkutbay.studentservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${example.message:Varsayılan Mesaj}")
    private String message;

    @GetMapping("/config")
    public String getMessage() {
        return message;
    }
}