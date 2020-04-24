package com.zhiliao.mybatis.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "t_cms_admin_key")
public class TCmsAdminKey implements Serializable {
    @Id
    @Column(name = "thisKey")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private String thiskey;

    private static final long serialVersionUID = 1L;

    /**
     * @return thisKey
     */
    public String getThiskey() {
        return thiskey;
    }

    /**
     * @param thiskey
     */
    public void setThiskey(String thiskey) {
        this.thiskey = thiskey;
    }
}