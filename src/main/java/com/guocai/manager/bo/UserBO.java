package com.guocai.manager.bo;

import com.guocai.manager.base.Pager;
import io.swagger.annotations.ApiModelProperty;

/**
 * java类简单作用描述
 *
 * @ClassName: UserBO
 * @Package: com.guocai.manager.bo
 * @Description:
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-05-29 16:48
 */
public class UserBO extends Pager {
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
    @ApiModelProperty(value = "年龄", example = "23")
    private Integer age;

    /**
     * 性别(0:女，1：男)
     */
    @ApiModelProperty(value = "性别", example = "1")
    private String gender;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址", example = "泰康创新中心")
    private String address;

    public String getId() {
        return id;
    }

    public UserBO setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public UserBO setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserBO setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public UserBO setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public UserBO setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public UserBO setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserBO setAddress(String address) {
        this.address = address;
        return this;
    }
}
