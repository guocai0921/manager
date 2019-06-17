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
@TableName("sgc_position")
public class Position extends Model<Position> {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 职位
     */
    private String name;

    private Date createDate;

    private Integer enabled;

    public Position() {
    }

    public Position(String name) {
        this.name = name;
    }

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
        return "Position{" +
        "id=" + id +
        ", name=" + name +
        ", createDate=" + createDate +
        ", enabled=" + enabled +
        "}";
    }
}
