package com.test.spring.boot.logger.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("spring-boot-logger-server")
@RequestMapping
public interface SayHiControllerResource {

    @RequestMapping(value = "/sayHi", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    String sayHi();

}
