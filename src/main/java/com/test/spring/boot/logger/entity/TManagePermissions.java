package com.test.spring.boot.logger.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "slp..t_manage_permissions")
public class TManagePermissions {
    /**
     * id
     */
    @Id
    @Column(name = "Aid")
    private Integer aid;

    /**
     * 菜单id
     */
    @Column(name = "Apermission_id")
    private Integer apermissionId;

    /**
     * 父菜单ID
     */
    @Column(name = "Apermission_parent_id")
    private Integer apermissionParentId;

    /**
     * 父菜单名称
     */
    @Column(name = "Apermission_parent_name")
    private String apermissionParentName;

    /**
     * 菜单文本
     */
    @Column(name = "Aname")
    private String aname;

    /**
     * 菜单地址
     */
    @Column(name = "Aurl")
    private String aurl;

    /**
     * 描述
     */
    @Column(name = "Adescription")
    private String adescription;

    /**
     * 菜单类型（0为菜单，1为按钮）
     */
    @Column(name = "Atype")
    private Integer atype;

    /**
     * 数据状态（1为启用，2为停用）
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
     * 获取id
     *
     * @return Aid - id
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置id
     *
     * @param aid id
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取菜单id
     *
     * @return Apermission_id - 菜单id
     */
    public Integer getApermissionId() {
        return apermissionId;
    }

    /**
     * 设置菜单id
     *
     * @param apermissionId 菜单id
     */
    public void setApermissionId(Integer apermissionId) {
        this.apermissionId = apermissionId;
    }

    /**
     * 获取父菜单ID
     *
     * @return Apermission_parent_id - 父菜单ID
     */
    public Integer getApermissionParentId() {
        return apermissionParentId;
    }

    /**
     * 设置父菜单ID
     *
     * @param apermissionParentId 父菜单ID
     */
    public void setApermissionParentId(Integer apermissionParentId) {
        this.apermissionParentId = apermissionParentId;
    }

    /**
     * 获取父菜单名称
     *
     * @return Apermission_parent_name - 父菜单名称
     */
    public String getApermissionParentName() {
        return apermissionParentName;
    }

    /**
     * 设置父菜单名称
     *
     * @param apermissionParentName 父菜单名称
     */
    public void setApermissionParentName(String apermissionParentName) {
        this.apermissionParentName = apermissionParentName;
    }

    /**
     * 获取菜单文本
     *
     * @return Aname - 菜单文本
     */
    public String getAname() {
        return aname;
    }

    /**
     * 设置菜单文本
     *
     * @param aname 菜单文本
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * 获取菜单地址
     *
     * @return Aurl - 菜单地址
     */
    public String getAurl() {
        return aurl;
    }

    /**
     * 设置菜单地址
     *
     * @param aurl 菜单地址
     */
    public void setAurl(String aurl) {
        this.aurl = aurl;
    }

    /**
     * 获取描述
     *
     * @return Adescription - 描述
     */
    public String getAdescription() {
        return adescription;
    }

    /**
     * 设置描述
     *
     * @param adescription 描述
     */
    public void setAdescription(String adescription) {
        this.adescription = adescription;
    }

    /**
     * 获取菜单类型（0为菜单，1为按钮）
     *
     * @return Atype - 菜单类型（0为菜单，1为按钮）
     */
    public Integer getAtype() {
        return atype;
    }

    /**
     * 设置菜单类型（0为菜单，1为按钮）
     *
     * @param atype 菜单类型（0为菜单，1为按钮）
     */
    public void setAtype(Integer atype) {
        this.atype = atype;
    }

    /**
     * 获取数据状态（1为启用，2为停用）
     *
     * @return Astatus - 数据状态（1为启用，2为停用）
     */
    public Integer getAstatus() {
        return astatus;
    }

    /**
     * 设置数据状态（1为启用，2为停用）
     *
     * @param astatus 数据状态（1为启用，2为停用）
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
}