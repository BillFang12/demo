package com.go.home.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String url="";
    private String driverUrl="";

}
