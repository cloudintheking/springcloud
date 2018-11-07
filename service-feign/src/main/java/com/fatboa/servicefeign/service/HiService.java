package com.fatboa.servicefeign.service;

import com.fatboa.servicefeign.service.fallback.HiServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: hl
 * @time: 2018/10/31 16:27
 * @description:
 */
@FeignClient(value = "service-hi", fallback = HiServiceHystric.class)
public interface HiService {
    @GetMapping("/hi")
    String sayHiFromOneClient(@RequestParam(value = "name") String name);
}
