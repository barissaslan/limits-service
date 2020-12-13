package com.aslanbaris.limitsservice;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@org.springframework.context.annotation.Configuration
@ConfigurationProperties(prefix = "limits-service")
public class Configuration {
    private int minimum;
    private int maximum;
}
