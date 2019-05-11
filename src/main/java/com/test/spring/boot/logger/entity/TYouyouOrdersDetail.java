package com.test.spring.boot.logger.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_youyou_orders_detail")
public class TYouyouOrdersDetail {
    /**
     * 订单编号
     */
    @Id
    @Column(name = "Aorder_id")
    private String aorderId;

    /**
     * 用户id
     */
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 锁的id，即设备id(床位id)
     */
    @Column(name = "Alock_id")
    private String alockId;

    /**
     * 城市
     */
    @Column(name = "Acities")
    private String acities;

    /**
     * 医院id
     */
    @Column(name = "Ahospital_id")
    private Integer ahospitalId;

    /**
     * 科室
     */
    @Column(name = "Adepartments")
    private String adepartments;

    /**
     * 实际支付金额
     */
    @Column(name = "Apay_price")
    private BigDecimal apayPrice;

    /**
     * 实收金额
     */
    @Column(name = "Aactual_price")
    private BigDecimal aactualPrice;

    /**
     * 折扣价
     */
    @Column(name = "Adiscount_price")
    private BigDecimal adiscountPrice;

    /**
     * 折扣级别
     */
    @Column(name = "Adiscount_grade")
    private String adiscountGrade;

    /**
     * 订单状态1:payed,2:completed,3:canceled,4:refunded
     */
    @Column(name = "Aorder_status")
    private Integer aorderStatus;

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
     * 要求备注
     */
    @Column(name = "Arequest_remark")
    private String arequestRemark;

    /**
     * 获取订单编号
     *
     * @return Aorder_id - 订单编号
     */
    public String getAorderId() {
        return aorderId;
    }

    /**
     * 设置订单编号
     *
     * @param aorderId 订单编号
     */
    public void setAorderId(String aorderId) {
        this.aorderId = aorderId;
    }

    /**
     * 获取用户id
     *
     * @return Aid - 用户id
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置用户id
     *
     * @param aid 用户id
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取锁的id，即设备id(床位id)
     *
     * @return Alock_id - 锁的id，即设备id(床位id)
     */
    public String getAlockId() {
        return alockId;
    }

    /**
     * 设置锁的id，即设备id(床位id)
     *
     * @param alockId 锁的id，即设备id(床位id)
     */
    public void setAlockId(String alockId) {
        this.alockId = alockId;
    }

    /**
     * 获取城市
     *
     * @return Acities - 城市
     */
    public String getAcities() {
        return acities;
    }

    /**
     * 设置城市
     *
     * @param acities 城市
     */
    public void setAcities(String acities) {
        this.acities = acities;
    }

    /**
     * 获取医院id
     *
     * @return Ahospital_id - 医院id
     */
    public Integer getAhospitalId() {
        return ahospitalId;
    }

    /**
     * 设置医院id
     *
     * @param ahospitalId 医院id
     */
    public void setAhospitalId(Integer ahospitalId) {
        this.ahospitalId = ahospitalId;
    }

    /**
     * 获取科室
     *
     * @return Adepartments - 科室
     */
    public String getAdepartments() {
        return adepartments;
    }

    /**
     * 设置科室
     *
     * @param adepartments 科室
     */
    public void setAdepartments(String adepartments) {
        this.adepartments = adepartments;
    }

    /**
     * 获取实际支付金额
     *
     * @return Apay_price - 实际支付金额
     */
    public BigDecimal getApayPrice() {
        return apayPrice;
    }

    /**
     * 设置实际支付金额
     *
     * @param apayPrice 实际支付金额
     */
    public void setApayPrice(BigDecimal apayPrice) {
        this.apayPrice = apayPrice;
    }

    /**
     * 获取实收金额
     *
     * @return Aactual_price - 实收金额
     */
    public BigDecimal getAactualPrice() {
        return aactualPrice;
    }

    /**
     * 设置实收金额
     *
     * @param aactualPrice 实收金额
     */
    public void setAactualPrice(BigDecimal aactualPrice) {
        this.aactualPrice = aactualPrice;
    }

    /**
     * 获取折扣价
     *
     * @return Adiscount_price - 折扣价
     */
    public BigDecimal getAdiscountPrice() {
        return adiscountPrice;
    }

    /**
     * 设置折扣价
     *
     * @param adiscountPrice 折扣价
     */
    public void setAdiscountPrice(BigDecimal adiscountPrice) {
        this.adiscountPrice = adiscountPrice;
    }

    /**
     * 获取折扣级别
     *
     * @return Adiscount_grade - 折扣级别
     */
    public String getAdiscountGrade() {
        return adiscountGrade;
    }

    /**
     * 设置折扣级别
     *
     * @param adiscountGrade 折扣级别
     */
    public void setAdiscountGrade(String adiscountGrade) {
        this.adiscountGrade = adiscountGrade;
    }

    /**
     * 获取订单状态1:payed,2:completed,3:canceled,4:refunded
     *
     * @return Aorder_status - 订单状态1:payed,2:completed,3:canceled,4:refunded
     */
    public Integer getAorderStatus() {
        return aorderStatus;
    }

    /**
     * 设置订单状态1:payed,2:completed,3:canceled,4:refunded
     *
     * @param aorderStatus 订单状态1:payed,2:completed,3:canceled,4:refunded
     */
    public void setAorderStatus(Integer aorderStatus) {
        this.aorderStatus = aorderStatus;
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
     * 获取要求备注
     *
     * @return Arequest_remark - 要求备注
     */
    public String getArequestRemark() {
        return arequestRemark;
    }

    /**
     * 设置要求备注
     *
     * @param arequestRemark 要求备注
     */
    public void setArequestRemark(String arequestRemark) {
        this.arequestRemark = arequestRemark;
    }
}