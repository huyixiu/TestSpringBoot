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

    @Resource
    private TManageRoleMapper manageRoleMapper;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String sayHi(){
        logger.info("这是一句info");
        logger.error("这是一句error");
        logger.warn("这是一句warn");


        return "这是一句测试！";
    }
    /**
     * @Author hyx
     * @Description 查表测试
     * @Date 2019/4/13 0013 16:46
     * @param
     * @return void
     **/
    @RequestMapping(value = "/select")
    public void select(){
        List<TManageRole> list = manageRoleMapper.selectAll();
    }

    /**
     * @Author hyx
     * @Description 测试分页查询
     * @Date 2019/4/13 0013 16:47
     * @param
     * @return void
     **/
    @RequestMapping(value = "/page")
    public void testPage(){
        PageHelper.startPage(1,10);
        Example example =new Example(TManageRole.class);
        PageInfo<TManageRole> pageInfo = new PageInfo<>(manageRoleMapper.selectByExample(example));
        List<TManageRole> list = pageInfo.getList();

    }

    /**
     * @Author hyx
     * @Description 插入表
     * @Date 2019/4/13 0013 16:54
     * @param
     * @return void
     **/
    @RequestMapping(value = "/insert")
    public void testInsert(){
        TManageRole manageRole = new TManageRole();
        manageRole.setAid(1);
        manageRoleMapper.insert(manageRole);
    }

    /**
     * @Author hyx
     * @Description 删除
     * @Date 2019/4/13 0013 16:56
     * @param
     * @return void
     **/
    @RequestMapping(value = "/delete")
    public void testDelete(){
        TManageRole manageRole = new TManageRole();
        manageRole.setAid(1);
        manageRoleMapper.delete(manageRole);
    }

    /**
     * @Author hyx
     * @Description 修改
     * @Date 2019/4/13 0013 16:57
     * @param
     * @return void
     **/
    @RequestMapping(value = "/update")
    public void testUpdate(){
        //构造条件
        Example example = new Example(TManageRole.class);
        example.createCriteria().andEqualTo("roleName","管理员");

        //测试数据
        TManageRole manageRole = new TManageRole();
        manageRole.setAid(1);
        manageRoleMapper.updateByExample(manageRole,example);
    }
}
