package com.zhiliao.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "config_info_aggr")
public class ConfigInfoAggr {
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

    /**
     * group_id
     */
    @Column(name = "group_id")
    private String groupId;

    /**
     * datum_id
     */
    @Column(name = "datum_id")
    private String datumId;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    @Column(name = "app_name")
    private String appName;

    /**
     * 租户字段
     */
    @Column(name = "tenant_id")
    private String tenantId;

    /**
     * 内容
     */
    private String content;

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
     * 获取group_id
     *
     * @return group_id - group_id
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 设置group_id
     *
     * @param groupId group_id
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取datum_id
     *
     * @return datum_id - datum_id
     */
    public String getDatumId() {
        return datumId;
    }

    /**
     * 设置datum_id
     *
     * @param datumId datum_id
     */
    public void setDatumId(String datumId) {
        this.datumId = datumId;
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
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}