package com.sbootparent.sbootTurbineServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine //注入turbine Server
@SpringBootApplication
public class SbootTurbineServerApplication {

    public static void main(String[] args) {
        System.out.print("turbine Server 服务端开始启动。。。。。");
        SpringApplication.run(SbootTurbineServerApplication.class, args);
        System.out.print("turbine Server 服务端结束启动。。。。。");
    }

}
