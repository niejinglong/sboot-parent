package com.sbootparent.sbootTurbineServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableTurbine //注入turbine Server
@SpringBootApplication
public class SbootTurbineServerApplication {
    private static Logger logger = LoggerFactory.getLogger(SbootTurbineServerApplication.class);

    public static void main(String[] args) {
        logger.info("turbine Server 服务端开始启动。。。。。");
        SpringApplication.run(SbootTurbineServerApplication.class, args);
        logger.info("turbine Server 服务端结束启动。。。。。");
    }
}
