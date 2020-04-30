package com.zhiliao.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "config_info")
public class ConfigInfo {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * data_id
     */
    @Column(name = "data_id")
    private String dataId;

    @Column(name = "group_id")
    private String groupId;

    /**
     * md5
     */
    private String md5;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * source ip
     */
    @Column(name = "src_ip")
    private String srcIp;

    @Column(name = "app_name")
    private String appName;

    /**
     * 租户字段
     */
    @Column(name = "tenant_id")
    private String tenantId;

    @Column(name = "c_desc")
    private String cDesc;

    @Column(name = "c_use")
    private String cUse;

    private String effect;

    private String type;

    /**
     * content
     */
    private String content;

    /**
     * source user
     */
    @Column(name = "src_user")
    private String srcUser;

    @Column(name = "c_schema")
    private String cSchema;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取data_id
     *
     * @return data_id - data_id
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * 设置data_id
     *
     * @param dataId data_id
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * @return group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取md5
     *
     * @return md5 - md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * 设置md5
     *
     * @param md5 md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_create - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取source ip
     *
     * @return src_ip - source ip
     */
    public String getSrcIp() {
        return srcIp;
    }

    /**
     * 设置source ip
     *
     * @param srcIp source ip
     */
    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    /**
     * @return app_name
     */
    public String getAppName() {
        return appName;
    }

    /**
     * @param appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取租户字段
     *
     * @return tenant_id - 租户字段
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * 设置租户字段
     *
     * @param tenantId 租户字段
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * @return c_desc
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * @param cDesc
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    /**
     * @return c_use
     */
    public String getcUse() {
        return cUse;
    }

    /**
     * @param cUse
     */
    public void setcUse(String cUse) {
        this.cUse = cUse;
    }

    /**
     * @return effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * @param effect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取content
     *
     * @return content - content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置content
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取source user
     *
     * @return src_user - source user
     */
    public String getSrcUser() {
        return srcUser;
    }

    /**
     * 设置source user
     *
     * @param srcUser source user
     */
    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    /**
     * @return c_schema
     */
    public String getcSchema() {
        return cSchema;
    }

    /**
     * @param cSchema
     */
    public void setcSchema(String cSchema) {
        this.cSchema = cSchema;
    }
}