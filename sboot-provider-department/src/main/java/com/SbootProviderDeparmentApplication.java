package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 服务提供者Department启动器
 */
@SpringBootApplication
@EnableEurekaClient //注入eureka服务端服务
public class SbootProviderDeparmentApplication {

    public static void main(String[] args) {
        System.out.print("服务提供者Department启动开始。。。。");
        SpringApplication.run(SbootProviderDeparmentApplication.class, args);
        System.out.print("服务提供者Department启动结束。。。。");
    }

}
