package com.fatboa.servicefeign.service;

import com.fatboa.servicefeign.service.fallback.HiServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: hl
 * @time: 2018/11/15 10:50
 * @description: ziplin 服务追踪测试
 */
@FeignClient(value = "service-ribbon", fallback = HiServiceHystric.class)
public interface TraceService {
    @GetMapping("/ribbon")
    String trace();
}
