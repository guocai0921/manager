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
 * @author Mht
 * @since 2019-05-29
 */
@TableName("sgc_user")
@ApiModel(value = "User", description ="用户信息")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @ApiModelProperty(value = "用户ID", example = "583322129366253568")
    private String id;

    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名", example = "孙国财")
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码", example = "pass234")
    private String password;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID", example = "1")
    private Integer orgId;

    /**
     * 年龄
     */
    @ApiModelProperty(value = "年龄", example = "23", allowableValues = "range[0, 150]")
    private Integer age;

    /**
     * 性别(0:女，1：男)
     */
    @ApiModelProperty(value = "性别", example = "1", allowableValues = "0, 1")
    private String gender;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址", example = "泰康创新中心")
    private String address;

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public User setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public User setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
