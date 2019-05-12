package com.test.spring.boot.logger.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.spring.boot.logger.entity.TManageRole;
import com.test.spring.boot.logger.mapper.TManageRoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName:SayHiController
 * @Description
 * @Author: hyx
 * @Date: 2019-04-12 15:47
 * @Version 1.0
 */
@RestController
public class SayHiController {
    private static final Logger logger = LoggerFactory.getLogger(SayHiController.class);

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String sayHi(){
        logger.info("这是一句info");
        logger.error("这是一句error");
        logger.warn("这是一句warn");


        return "这是一句测试！";
    }

}
