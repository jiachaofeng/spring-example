package com.charlesjia.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //使用LoadBalanced注解使RestTemplate有负载均衡的功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
