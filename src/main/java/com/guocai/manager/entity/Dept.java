package com.guocai.manager.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-05-30
 */
@TableName("sgc_dept")
@ApiModel(value = "Dept", description ="部门信息")
public class Dept extends Model<Dept> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "用户ID", example = "583322129366253568")
    private String id;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "用户ID", example = "01")
    private String deptId;

    /**
     * 部门名称
     */
    @ApiModelProperty(value = "用户ID", example = "北京分公司")
    private String deptName;

    /**
     * 部门父ID
     */
    @ApiModelProperty(value = "部门父ID", example = "0")
    private String parentId;

    /**
     * 是否启用(0:是，1：否)
     */
    @ApiModelProperty(value = "部门父ID", example = "0")
    private String isEnable;

    public String getId() {
        return id;
    }

    public Dept setId(String id) {
        this.id = id;
        return this;
    }

    public String getDeptId() {
        return deptId;
    }

    public Dept setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }

    public String getDeptName() {
        return deptName;
    }

    public Dept setDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public Dept setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public Dept setIsEnable(String isEnable) {
        this.isEnable = isEnable;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
