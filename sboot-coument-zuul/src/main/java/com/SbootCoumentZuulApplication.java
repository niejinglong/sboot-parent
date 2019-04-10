package com;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy        //使用反向代理
@EnableCircuitBreaker   // 开启断路器
public class SbootCoumentZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootCoumentZuulApplication.class, args);
    }

}
