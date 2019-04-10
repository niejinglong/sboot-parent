package com;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient     //服务注册与发现
@EnableFeignClients     //使用feign客户端调用远程服务
@EnableCircuitBreaker   //开启断路器
public class SbootCoumentUserApplication {
    /*@Bean
    @LoadBalanced
    public RestTemplate restTemplate (){return new RestTemplate();}*/

    // SpringBoot2.0以后，不提供 hystrix.stream节点，需要自己增加
    //解决2.0.x 版本集成hystrix dashboard 报 Unable to connect to Command Metric Stream. 问题
    /*@Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/actuator/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }*/
    public static void main(String[] args) {
        System.out.print("服务消费者启动开始。。。。");
        SpringApplication.run(SbootCoumentUserApplication.class, args);
        System.out.print("服务消费者启动结束。。。。");
    }

}
