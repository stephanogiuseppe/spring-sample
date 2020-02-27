package com.stephano.springbootsample.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;

@Getter
@Setter
@Configuration
@ConfigurationProperties("spring.datasource")
public class MyConfiguration {
    private String myConf;

    @Bean
    @Profile("dev")
    public String testDevConfiguration() {
        System.out.println("My configuration: " + myConf);
        return "Configuration DEV";
    }

    @Bean
    @Profile("prod")
    public String testProdConfiguration() {
        System.out.println("My configuration: " + myConf);
        return "Configuration PROD";
    }
}
