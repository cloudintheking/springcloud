package com.fatboa.servicefeign.service.fallback;

import com.fatboa.servicefeign.service.HiService;
import com.fatboa.servicefeign.service.TraceService;
import org.aspectj.weaver.tools.Trace;
import org.springframework.stereotype.Component;

/**
 * @author: hl
 * @time: 2018/10/31 16:57
 * @description:
 */
@Component
public class HiServiceHystric implements HiService, TraceService {
    @Override
    public String sayHiFromOneClient(String name) {
        return "sorry," + name;
    }

    @Override
    public String trace() {
        return "ee,service-ribbon挂啦";
    }
}
