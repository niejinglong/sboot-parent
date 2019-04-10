package com.controller;

import com.entity.User;
import com.serviceFeign.UsFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.openfeign.support.FeignUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class McControllerFeign {

    @Autowired
    private UsFeignService usFeignService; // feign 远程服务
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/getUserList/{id}")
    public User getUserList(@PathVariable Long id){
        return usFeignService.findById(id);
    }
    @GetMapping("/getUsAllList")
    public List<User> getUsAllList(){
        return usFeignService.findUserAll();
    }
    @GetMapping("/test")
    public String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("sboot-provider-user");
        System.out.print("=======1-请求服务器名称："+serviceInstance.getServiceId()+",服务器ip："+serviceInstance.getHost()+"，服务器端口："+serviceInstance.getPort()+"\n");
        //ServiceInstance serviceInstance2 = loadBalancerClient.choose("sboot-provider-user2");
        //System.out.print("=======2-请求服务器名称："+serviceInstance2.getServiceId()+",服务器ip："+serviceInstance2.getHost()+"，服务器端口："+serviceInstance2.getPort()+"\n");
        return "1";
    }
}
