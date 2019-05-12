package org.springframework.boot.SpringApplicationTests;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.test.spring.boot.logger.SpringBootLoggerApplication;
import com.test.spring.boot.logger.entity.TManageRole;
import com.test.spring.boot.logger.mapper.TManageRoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName:SpringBootLoggerApplicationTests
 * @Description
 * @Author:huyix
 * @Date:2019-05-12 11:31
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootLoggerApplication.class)
@Transactional
@Rollback
public class SpringBootLoggerApplicationTests {

    @Resource
    private TManageRoleMapper manageRoleMapper;

    /**
     * @Author hyx
     * @Description 查表测试
     * @Date 2019/4/13 0013 16:46
     * @param
     * @return void
     **/
    @Test
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
    @Test
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
    @Test
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
    @Test
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
    @Test
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
