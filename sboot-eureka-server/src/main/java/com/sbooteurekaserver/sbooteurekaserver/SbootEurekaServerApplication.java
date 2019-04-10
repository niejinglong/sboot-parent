package com.sbooteurekaserver.sbooteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbootEurekaServerApplication {

    public static void main(String[] args) {
        System.out.print("eureka服务端启动。。。");
        SpringApplication.run(SbootEurekaServerApplication.class, args);
        System.out.print("eureka服务端结束。。。");
    }

}
