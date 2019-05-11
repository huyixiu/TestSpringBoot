package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "test..t_youyou_bed")
public class TYouyouBed {
    /**
     * 陪护床设备编号
     */
    @Id
    @Column(name = "Abed_code")
    private String abedCode;

    /**
     * 医院id
     */
    @Column(name = "Ahospital_id")
    private Integer ahospitalId;

    /**
     * 医院科室
     */
    @Column(name = "Ahospital_departments")
    private String ahospitalDepartments;

    /**
     * 床位编号
     */
    @Column(name = "Abed_no")
    private String abedNo;

    /**
     * mac
     */
    @Column(name = "Abed_mac")
    private String abedMac;

    /**
     * key
     */
    @Column(name = "Abed_key")
    private String abedKey;

    /**
     * password
     */
    @Column(name = "Abed_password")
    private String abedPassword;

    /**
     * 设备电量
     */
    @Column(name = "Abed_elec")
    private String abedElec;

    /**
     * 设备开始使用时间
     */
    @Column(name = "Abed_begintime")
    private String abedBegintime;

    /**
     * 设备结束使用时间
     */
    @Column(name = "Abed_endintime")
    private String abedEndintime;

    /**
     * （1正常，0异常）
     */
    @Column(name = "Abed_status")
    private String abedStatus;

    /**
     * 记录状态（1上架，0下架）
     */
    @Column(name = "Astatus")
    private Integer astatus;

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
     * 获取陪护床设备编号
     *
     * @return Abed_code - 陪护床设备编号
     */
    public String getAbedCode() {
        return abedCode;
    }

    /**
     * 设置陪护床设备编号
     *
     * @param abedCode 陪护床设备编号
     */
    public void setAbedCode(String abedCode) {
        this.abedCode = abedCode;
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
     * 获取床位编号
     *
     * @return Abed_no - 床位编号
     */
    public String getAbedNo() {
        return abedNo;
    }

    /**
     * 设置床位编号
     *
     * @param abedNo 床位编号
     */
    public void setAbedNo(String abedNo) {
        this.abedNo = abedNo;
    }

    /**
     * 获取mac
     *
     * @return Abed_mac - mac
     */
    public String getAbedMac() {
        return abedMac;
    }

    /**
     * 设置mac
     *
     * @param abedMac mac
     */
    public void setAbedMac(String abedMac) {
        this.abedMac = abedMac;
    }

    /**
     * 获取key
     *
     * @return Abed_key - key
     */
    public String getAbedKey() {
        return abedKey;
    }

    /**
     * 设置key
     *
     * @param abedKey key
     */
    public void setAbedKey(String abedKey) {
        this.abedKey = abedKey;
    }

    /**
     * 获取password
     *
     * @return Abed_password - password
     */
    public String getAbedPassword() {
        return abedPassword;
    }

    /**
     * 设置password
     *
     * @param abedPassword password
     */
    public void setAbedPassword(String abedPassword) {
        this.abedPassword = abedPassword;
    }

    /**
     * 获取设备电量
     *
     * @return Abed_elec - 设备电量
     */
    public String getAbedElec() {
        return abedElec;
    }

    /**
     * 设置设备电量
     *
     * @param abedElec 设备电量
     */
    public void setAbedElec(String abedElec) {
        this.abedElec = abedElec;
    }

    /**
     * 获取设备开始使用时间
     *
     * @return Abed_begintime - 设备开始使用时间
     */
    public String getAbedBegintime() {
        return abedBegintime;
    }

    /**
     * 设置设备开始使用时间
     *
     * @param abedBegintime 设备开始使用时间
     */
    public void setAbedBegintime(String abedBegintime) {
        this.abedBegintime = abedBegintime;
    }

    /**
     * 获取设备结束使用时间
     *
     * @return Abed_endintime - 设备结束使用时间
     */
    public String getAbedEndintime() {
        return abedEndintime;
    }

    /**
     * 设置设备结束使用时间
     *
     * @param abedEndintime 设备结束使用时间
     */
    public void setAbedEndintime(String abedEndintime) {
        this.abedEndintime = abedEndintime;
    }

    /**
     * 获取（1正常，0异常）
     *
     * @return Abed_status - （1正常，0异常）
     */
    public String getAbedStatus() {
        return abedStatus;
    }

    /**
     * 设置（1正常，0异常）
     *
     * @param abedStatus （1正常，0异常）
     */
    public void setAbedStatus(String abedStatus) {
        this.abedStatus = abedStatus;
    }

    /**
     * 获取记录状态（1上架，0下架）
     *
     * @return Astatus - 记录状态（1上架，0下架）
     */
    public Integer getAstatus() {
        return astatus;
    }

    /**
     * 设置记录状态（1上架，0下架）
     *
     * @param astatus 记录状态（1上架，0下架）
     */
    public void setAstatus(Integer astatus) {
        this.astatus = astatus;
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