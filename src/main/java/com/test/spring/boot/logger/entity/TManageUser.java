package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_manage_user")
public class TManageUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 用户名
     */
    @Column(name = "Auser_name")
    private String auserName;

    /**
     * 密码
     */
    @Column(name = "Apass_word")
    private String apassWord;

    /**
     * 角色id
     */
    @Column(name = "Arole_id")
    private Integer aroleId;

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
     * 获取主键
     *
     * @return Aid - 主键
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置主键
     *
     * @param aid 主键
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取用户名
     *
     * @return Auser_name - 用户名
     */
    public String getAuserName() {
        return auserName;
    }

    /**
     * 设置用户名
     *
     * @param auserName 用户名
     */
    public void setAuserName(String auserName) {
        this.auserName = auserName;
    }

    /**
     * 获取密码
     *
     * @return Apass_word - 密码
     */
    public String getApassWord() {
        return apassWord;
    }

    /**
     * 设置密码
     *
     * @param apassWord 密码
     */
    public void setApassWord(String apassWord) {
        this.apassWord = apassWord;
    }

    /**
     * 获取角色id
     *
     * @return Arole_id - 角色id
     */
    public Integer getAroleId() {
        return aroleId;
    }

    /**
     * 设置角色id
     *
     * @param aroleId 角色id
     */
    public void setAroleId(Integer aroleId) {
        this.aroleId = aroleId;
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