package com.test.spring.boot.logger.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.spring.boot.logger.api.SayHiControllerResource;
import com.test.spring.boot.logger.server.response.FSResponseModel;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;


/**
 * @ClassName:SayHiController
 * @Description
 * @Author: hyx
 * @Date: 2019-04-12 15:47
 * @Version 1.0
 */
@Slf4j
@RestController
public class SayHiController implements SayHiControllerResource {
    private static final Logger log = LoggerFactory.getLogger(SayHiController.class);

    @Override
    public String sayHi(){
        log.info("测试");
        FSResponseModel<Object> responseModel = new FSResponseModel<>();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("date","这是一句测试");
        responseModel.setDate(jsonObject);
        return JSONObject.toJSONString(responseModel);
    }

}
