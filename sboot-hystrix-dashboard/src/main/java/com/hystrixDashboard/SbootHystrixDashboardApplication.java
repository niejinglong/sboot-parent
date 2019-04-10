package com.hystrixDashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class SbootHystrixDashboardApplication {

	public static void main(String[] args) {
		System.out.print("HystrixDashboarServer 服务端开始启动。。。");
		SpringApplication.run(SbootHystrixDashboardApplication.class, args);
		System.out.print("HystrixDashboarServer 服务端结束启动。。。");
	}

}
