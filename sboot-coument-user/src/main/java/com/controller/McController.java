package com.controller;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/m")
public class McController {

    /*@Autowired
    private RestTemplate restTemplate; //远程http请求服务
    @Autowired
    private LoadBalancerClient loadBalancerClient;//获取请求服务信息

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        System.out.print("======"+restTemplate.getForObject("http://127.0.0.1:8080/u/findById/"+id, User.class));
       return restTemplate.getForObject("http://127.0.0.1:8080/u/findById/"+id, User.class);
    }

    @GetMapping("/test")
    public String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("sboot-provider-user");
        System.out.print("=======1-请求服务器名称："+serviceInstance.getServiceId()+",服务器ip："+serviceInstance.getHost()+"，服务器端口："+serviceInstance.getPort()+"\n");
        //ServiceInstance serviceInstance2 = loadBalancerClient.choose("sboot-provider-user2");
        //System.out.print("=======2-请求服务器名称："+serviceInstance2.getServiceId()+",服务器ip："+serviceInstance2.getHost()+"，服务器端口："+serviceInstance2.getPort()+"\n");
        return "1";
    }*/
}
