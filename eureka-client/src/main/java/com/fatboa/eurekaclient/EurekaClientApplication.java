package com.fatboa.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hl
 * @time: 2018/10/31 12:07
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
    @Value("${server.port}")
    private String port;
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class,args);
    }

@GetMapping("/hi")
    public String hi(@RequestParam(defaultValue = "sc") String name){
        return "hi "+name+",i'm form port "+port;
}
}
