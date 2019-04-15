package com;

import com.filter.MyPreFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy        //使用反向代理
@EnableCircuitBreaker   // 开启断路器
public class SbootCoumentZuulApplication {
    private static Logger logger = LoggerFactory.getLogger(SbootCoumentZuulApplication.class);
    //注入自定义filter过滤器
    @Bean
    public MyPreFilter MyPreFilter(){
        return new MyPreFilter();
    }
    public static void main(String[] args) {
        logger.info("Zuul智能路由反向代理服务启动开始。。。。");
        SpringApplication.run(SbootCoumentZuulApplication.class, args);
        logger.info("Zuul智能路由反向代理服务启动结束。。。。");
    }

}
