package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者User启动器
 */
@SpringBootApplication
@EnableEurekaClient     //服务注册与发现
@EnableCircuitBreaker   //开启断路器
public class SbootProviderUserApplication {

    public static void main(String[] args) {
        System.out.print("服务提供者User启动开始。。。。");
        SpringApplication.run(SbootProviderUserApplication.class, args);
        System.out.print("服务提供者User启动结束。。。。");
    }

}
