package com.fatboa.servicefeign.service.fallback;

import com.fatboa.servicefeign.service.HiService;
import org.springframework.stereotype.Component;

/**
 * @author: hl
 * @time: 2018/10/31 16:57
 * @description:
 */
@Component
public class HiServiceHystric implements HiService {
    @Override
    public String sayHiFromOneClient(String name) {
        return "sorry," + name;
    }
}
