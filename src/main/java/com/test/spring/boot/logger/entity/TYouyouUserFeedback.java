package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_youyou_user_feedback")
public class TYouyouUserFeedback {
    /**
     * 主键id
     */
    @Id
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 用户id
     */
    @Column(name = "Auser_id")
    private Integer auserId;

    /**
     * 反馈类型
     */
    @Column(name = "Afeedback_type")
    private String afeedbackType;

    /**
     * 反馈的图片
     */
    @Column(name = "Afeedback_url")
    private String afeedbackUrl;

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
     * 反馈意见
     */
    @Column(name = "Afeedback")
    private String afeedback;

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
     * 获取用户id
     *
     * @return Auser_id - 用户id
     */
    public Integer getAuserId() {
        return auserId;
    }

    /**
     * 设置用户id
     *
     * @param auserId 用户id
     */
    public void setAuserId(Integer auserId) {
        this.auserId = auserId;
    }

    /**
     * 获取反馈类型
     *
     * @return Afeedback_type - 反馈类型
     */
    public String getAfeedbackType() {
        return afeedbackType;
    }

    /**
     * 设置反馈类型
     *
     * @param afeedbackType 反馈类型
     */
    public void setAfeedbackType(String afeedbackType) {
        this.afeedbackType = afeedbackType;
    }

    /**
     * 获取反馈的图片
     *
     * @return Afeedback_url - 反馈的图片
     */
    public String getAfeedbackUrl() {
        return afeedbackUrl;
    }

    /**
     * 设置反馈的图片
     *
     * @param afeedbackUrl 反馈的图片
     */
    public void setAfeedbackUrl(String afeedbackUrl) {
        this.afeedbackUrl = afeedbackUrl;
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

    /**
     * 获取反馈意见
     *
     * @return Afeedback - 反馈意见
     */
    public String getAfeedback() {
        return afeedback;
    }

    /**
     * 设置反馈意见
     *
     * @param afeedback 反馈意见
     */
    public void setAfeedback(String afeedback) {
        this.afeedback = afeedback;
    }
}