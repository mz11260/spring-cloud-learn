package com.zm.cloud.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册与发现
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoveryHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscoveryHaApplication.class, args);
    }
}