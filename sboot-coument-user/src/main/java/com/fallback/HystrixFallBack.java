package com.fallback;

import com.entity.User;
import com.serviceFeign.UsFeignService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Component
public class HystrixFallBack implements UsFeignService {

    public User findById(Long id){
        User u = new User();
        u.setId(new Long(000));
        return u;
    }

    public List<User> findUserAll(){
        User u = new User();
        u.setId(new Long(0));
        List list = new ArrayList();
        list.add(u);
        return list;
    }
}
