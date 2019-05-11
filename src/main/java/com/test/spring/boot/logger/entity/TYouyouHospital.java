package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_youyou_hospital")
public class TYouyouHospital {
    /**
     * 主键id
     */
    @Id
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 医院
     */
    @Column(name = "Ahospital_name")
    private String ahospitalName;

    /**
     * 医院属于哪个城市
     */
    @Column(name = "Ahospital_city")
    private String ahospitalCity;

    /**
     * 医院科室
     */
    @Column(name = "Ahospital_departments")
    private String ahospitalDepartments;

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
     * 医院地址
     */
    @Column(name = "Ahospital_address")
    private String ahospitalAddress;

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
     * 获取医院
     *
     * @return Ahospital_name - 医院
     */
    public String getAhospitalName() {
        return ahospitalName;
    }

    /**
     * 设置医院
     *
     * @param ahospitalName 医院
     */
    public void setAhospitalName(String ahospitalName) {
        this.ahospitalName = ahospitalName;
    }

    /**
     * 获取医院属于哪个城市
     *
     * @return Ahospital_city - 医院属于哪个城市
     */
    public String getAhospitalCity() {
        return ahospitalCity;
    }

    /**
     * 设置医院属于哪个城市
     *
     * @param ahospitalCity 医院属于哪个城市
     */
    public void setAhospitalCity(String ahospitalCity) {
        this.ahospitalCity = ahospitalCity;
    }

    /**
     * 获取医院科室
     *
     * @return Ahospital_departments - 医院科室
     */
    public String getAhospitalDepartments() {
        return ahospitalDepartments;
    }

    /**
     * 设置医院科室
     *
     * @param ahospitalDepartments 医院科室
     */
    public void setAhospitalDepartments(String ahospitalDepartments) {
        this.ahospitalDepartments = ahospitalDepartments;
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
     * 获取医院地址
     *
     * @return Ahospital_address - 医院地址
     */
    public String getAhospitalAddress() {
        return ahospitalAddress;
    }

    /**
     * 设置医院地址
     *
     * @param ahospitalAddress 医院地址
     */
    public void setAhospitalAddress(String ahospitalAddress) {
        this.ahospitalAddress = ahospitalAddress;
    }
}