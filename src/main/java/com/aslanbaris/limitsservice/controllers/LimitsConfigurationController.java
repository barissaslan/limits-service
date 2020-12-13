package com.aslanbaris.limitsservice.controllers;

import com.aslanbaris.limitsservice.Configuration;
import com.aslanbaris.limitsservice.bean.LimitConfiguration;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LimitsConfigurationController {

    private final Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration retrieveLimitsFromConfigurations() {
        return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
    }

}
