package com.guocai.manager.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-14
 */
@TableName("sgc_joblevel")
public class Joblevel extends Model<Joblevel> {

    private static final long serialVersionUID = 1L;

    private String id;

    public Joblevel() {
    }

    public Joblevel(String name) {
        this.name = name;
    }

    /**
     * 职称名称
     */
    private String name;

    private String titleLevel;

    private Date createDate;

    private Integer enabled;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTitleLevel() {
        return titleLevel;
    }

    public void setTitleLevel(String titleLevel) {
        this.titleLevel = titleLevel;
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Joblevel{" +
        "id=" + id +
        ", name=" + name +
        ", titleLevel=" + titleLevel +
        ", createDate=" + createDate +
        ", enabled=" + enabled +
        "}";
    }
}
