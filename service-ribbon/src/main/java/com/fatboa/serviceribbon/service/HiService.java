package com.fatboa.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: hl
 * @time: 2018/10/31 13:53
 * @description:
 */
@Service
public class HiService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }

    String hiError(String name) {
        return "hi " + name + ",sorry,error";
    }
}
