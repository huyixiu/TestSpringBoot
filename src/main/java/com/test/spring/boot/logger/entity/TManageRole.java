package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_manage_role")
public class TManageRole {
    /**
     * 主键id
     */
    @Id
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 角色Id用来关联其他表数据
     */
    @Column(name = "Arole_id")
    private Integer aroleId;

    /**
     * 角色名称
     */
    @Column(name = "Arole_name")
    private String aroleName;

    /**
     * 角色描述
     */
    @Column(name = "Arole_desc")
    private String aroleDesc;

    /**
     * 1为管理员，2为劵商
     */
    @Column(name = "Atype")
    private Integer atype;

    /**
     * 1为启用，2为停用
     */
    @Column(name = "Astatus")
    private Integer astatus;

    /**
     * 创建人
     */
    @Column(name = "Acreator")
    private String acreator;

    /**
     * 创建时间
     */
    @Column(name = "Acreate_time")
    private Date acreateTime;

    /**
     * 更新人
     */
    @Column(name = "Amodifier")
    private String amodifier;

    /**
     * 更新时间
     */
    @Column(name = "Amodify_time")
    private Date amodifyTime;

    /**
     * 版本号
     */
    @Column(name = "Aversion")
    private Integer aversion;

    /**
     * 获取主键id
     *
     * @return Aid - 主键id
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置主键id
     *
     * @param aid 主键id
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取角色Id用来关联其他表数据
     *
     * @return Arole_id - 角色Id用来关联其他表数据
     */
    public Integer getAroleId() {
        return aroleId;
    }

    /**
     * 设置角色Id用来关联其他表数据
     *
     * @param aroleId 角色Id用来关联其他表数据
     */
    public void setAroleId(Integer aroleId) {
        this.aroleId = aroleId;
    }

    /**
     * 获取角色名称
     *
     * @return Arole_name - 角色名称
     */
    public String getAroleName() {
        return aroleName;
    }

    /**
     * 设置角色名称
     *
     * @param aroleName 角色名称
     */
    public void setAroleName(String aroleName) {
        this.aroleName = aroleName;
    }

    /**
     * 获取角色描述
     *
     * @return Arole_desc - 角色描述
     */
    public String getAroleDesc() {
        return aroleDesc;
    }

    /**
     * 设置角色描述
     *
     * @param aroleDesc 角色描述
     */
    public void setAroleDesc(String aroleDesc) {
        this.aroleDesc = aroleDesc;
    }

    /**
     * 获取1为管理员，2为劵商
     *
     * @return Atype - 1为管理员，2为劵商
     */
    public Integer getAtype() {
        return atype;
    }

    /**
     * 设置1为管理员，2为劵商
     *
     * @param atype 1为管理员，2为劵商
     */
    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    /**
     * 获取1为启用，2为停用
     *
     * @return Astatus - 1为启用，2为停用
     */
    public Integer getAstatus() {
        return astatus;
    }

    /**
     * 设置1为启用，2为停用
     *
     * @param astatus 1为启用，2为停用
     */
    public void setAstatus(Integer astatus) {
        this.astatus = astatus;
    }

    /**
     * 获取创建人
     *
     * @return Acreator - 创建人
     */
    public String getAcreator() {
        return acreator;
    }

    /**
     * 设置创建人
     *
     * @param acreator 创建人
     */
    public void setAcreator(String acreator) {
        this.acreator = acreator;
    }

    /**
     * 获取创建时间
     *
     * @return Acreate_time - 创建时间
     */
    public Date getAcreateTime() {
        return acreateTime;
    }

    /**
     * 设置创建时间
     *
     * @param acreateTime 创建时间
     */
    public void setAcreateTime(Date acreateTime) {
        this.acreateTime = acreateTime;
    }

    /**
     * 获取更新人
     *
     * @return Amodifier - 更新人
     */
    public String getAmodifier() {
        return amodifier;
    }

    /**
     * 设置更新人
     *
     * @param amodifier 更新人
     */
    public void setAmodifier(String amodifier) {
        this.amodifier = amodifier;
    }

    /**
     * 获取更新时间
     *
     * @return Amodify_time - 更新时间
     */
    public Date getAmodifyTime() {
        return amodifyTime;
    }

    /**
     * 设置更新时间
     *
     * @param amodifyTime 更新时间
     */
    public void setAmodifyTime(Date amodifyTime) {
        this.amodifyTime = amodifyTime;
    }

    /**
     * 获取版本号
     *
     * @return Aversion - 版本号
     */
    public Integer getAversion() {
        return aversion;
    }

    /**
     * 设置版本号
     *
     * @param aversion 版本号
     */
    public void setAversion(Integer aversion) {
        this.aversion = aversion;
    }
}