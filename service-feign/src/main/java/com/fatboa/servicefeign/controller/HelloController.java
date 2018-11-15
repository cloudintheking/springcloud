package com.fatboa.servicefeign.controller;

import com.fatboa.servicefeign.service.HiService;
import com.fatboa.servicefeign.service.TraceService;
import org.omg.CORBA.PUBLIC_MEMBER;
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
    @Autowired
    private TraceService traceService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFromOneClient(name);
    }

    @GetMapping("/feign")
    public String fegion() {
        return "hi,我是feign";
    }

    @GetMapping("/traceribbon")
    public String traceribbon() {
        return traceService.trace();
    }
}
