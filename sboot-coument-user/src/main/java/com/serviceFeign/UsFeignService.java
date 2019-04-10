package com.serviceFeign;

import com.entity.User;

import com.fallback.HystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 使用feign客户端调用远程服务
 */
//@MyFeignClient(serviceId = "${feign.serviceId}",name = "${feign.name}",url = "${feign.url}")
@FeignClient(name = "${feign.name}",fallback = HystrixFallBack.class)
public interface UsFeignService {
    /**
     * 获取用户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/u/findById/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/u/findUserAll",method = RequestMethod.GET)
    public List<User> findUserAll();
}
