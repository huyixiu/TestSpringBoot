package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_youyou_user")
public class TYouyouUser {
    /**
     * 主键id
     */
    @Id
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 手机号码
     */
    @Column(name = "Aphone")
    private String aphone;

    /**
     * 微信号
     */
    @Column(name = "Aopen_id")
    private String aopenId;

    /**
     * 用户名
     */
    @Column(name = "Aname")
    private String aname;

    /**
     * 用户名头像url
     */
    @Column(name = "Aname_url")
    private String anameUrl;

    /**
     * 性别(1-男; 0-女)
     */
    @Column(name = "Asex")
    private String asex;

    /**
     * 城市
     */
    @Column(name = "Acity")
    private String acity;

    /**
     * 邮箱
     */
    @Column(name = "Aemail")
    private String aemail;

    /**
     * 操作人id
     */
    @Column(name = "Aop_id")
    private Integer aopId;

    /**
     * 订单来源
     */
    @Column(name = "Asource")
    private Integer asource;

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
     * 修改人
     */
    @Column(name = "Amodifier")
    private String amodifier;

    /**
     * 修改时间
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
     * 获取手机号码
     *
     * @return Aphone - 手机号码
     */
    public String getAphone() {
        return aphone;
    }

    /**
     * 设置手机号码
     *
     * @param aphone 手机号码
     */
    public void setAphone(String aphone) {
        this.aphone = aphone;
    }

    /**
     * 获取微信号
     *
     * @return Aopen_id - 微信号
     */
    public String getAopenId() {
        return aopenId;
    }

    /**
     * 设置微信号
     *
     * @param aopenId 微信号
     */
    public void setAopenId(String aopenId) {
        this.aopenId = aopenId;
    }

    /**
     * 获取用户名
     *
     * @return Aname - 用户名
     */
    public String getAname() {
        return aname;
    }

    /**
     * 设置用户名
     *
     * @param aname 用户名
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * 获取用户名头像url
     *
     * @return Aname_url - 用户名头像url
     */
    public String getAnameUrl() {
        return anameUrl;
    }

    /**
     * 设置用户名头像url
     *
     * @param anameUrl 用户名头像url
     */
    public void setAnameUrl(String anameUrl) {
        this.anameUrl = anameUrl;
    }

    /**
     * 获取性别(1-男; 0-女)
     *
     * @return Asex - 性别(1-男; 0-女)
     */
    public String getAsex() {
        return asex;
    }

    /**
     * 设置性别(1-男; 0-女)
     *
     * @param asex 性别(1-男; 0-女)
     */
    public void setAsex(String asex) {
        this.asex = asex;
    }

    /**
     * 获取城市
     *
     * @return Acity - 城市
     */
    public String getAcity() {
        return acity;
    }

    /**
     * 设置城市
     *
     * @param acity 城市
     */
    public void setAcity(String acity) {
        this.acity = acity;
    }

    /**
     * 获取邮箱
     *
     * @return Aemail - 邮箱
     */
    public String getAemail() {
        return aemail;
    }

    /**
     * 设置邮箱
     *
     * @param aemail 邮箱
     */
    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    /**
     * 获取操作人id
     *
     * @return Aop_id - 操作人id
     */
    public Integer getAopId() {
        return aopId;
    }

    /**
     * 设置操作人id
     *
     * @param aopId 操作人id
     */
    public void setAopId(Integer aopId) {
        this.aopId = aopId;
    }

    /**
     * 获取订单来源
     *
     * @return Asource - 订单来源
     */
    public Integer getAsource() {
        return asource;
    }

    /**
     * 设置订单来源
     *
     * @param asource 订单来源
     */
    public void setAsource(Integer asource) {
        this.asource = asource;
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
     * 获取修改人
     *
     * @return Amodifier - 修改人
     */
    public String getAmodifier() {
        return amodifier;
    }

    /**
     * 设置修改人
     *
     * @param amodifier 修改人
     */
    public void setAmodifier(String amodifier) {
        this.amodifier = amodifier;
    }

    /**
     * 获取修改时间
     *
     * @return Amodify_time - 修改时间
     */
    public Date getAmodifyTime() {
        return amodifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param amodifyTime 修改时间
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