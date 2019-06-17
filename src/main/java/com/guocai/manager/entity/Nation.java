package com.guocai.manager.entity;

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
@TableName("sgc_nation")
public class Nation extends Model<Nation> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public Nation() {
    }

    public Nation(String name) {
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

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Nation{" +
        "id=" + id +
        ", name=" + name +
        "}";
    }
}
