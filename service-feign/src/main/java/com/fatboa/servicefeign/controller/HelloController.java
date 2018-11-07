package com.fatboa.servicefeign.controller;

import com.fatboa.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hl
 * @time: 2018/10/31 16:31
 * @description:
 */
@RestController
public class HelloController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFromOneClient(name);
    }
}
