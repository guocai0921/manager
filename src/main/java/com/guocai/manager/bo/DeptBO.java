package com.guocai.manager.bo;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.guocai.manager.base.Pager;

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
public class DeptBO extends Pager {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private String id;

    /**
     * 部门ID
     */
    private String deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 部门父ID
     */
    private String parentId;

    /**
     * 是否启用(0:是，1：否)
     */
    private String isEnable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String is_enable) {
        this.isEnable = isEnable;
    }

    @Override
    public String toString() {
        return "Dept{" +
        "id=" + id +
        ", deptId=" + deptId +
        ", deptName=" + deptName +
        ", parentId=" + parentId +
        ", isEnable=" + isEnable +
        "}";
    }
}
