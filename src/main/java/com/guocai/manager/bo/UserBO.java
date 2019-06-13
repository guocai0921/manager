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
    private String name;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码", example = "15010503631")
    private String phone;

    /**
     * 住宅电话
     */
    @ApiModelProperty(value = "住宅电话", example = "(0314)6499255")
    private String telephone;

    /**
     * 联系地址
     */
    @ApiModelProperty(value = "联系地址", example = "钓鱼公馆201")
    private String address;

    /**
     * 账户是否可用
     */
    @ApiModelProperty(value = "账户是否可用", example = "1")
    private Integer enabled;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名", example = "guocai0921")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "用户名", example = "Pass1234")
    private String password;

    /**
     * 用户头像
     */
    @ApiModelProperty(value = "用户名", example = "http://47.105.166.201/images/2019/06/06/1559825126859712.png")
    private String userface;

    /**
     * 备注
     */
    @ApiModelProperty(value = "用户名", example = "无")
    private String remark;

    public String getId() {
        return id;
    }

    public UserBO setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserBO setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserBO setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public UserBO setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserBO setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public UserBO setEnabled(Integer enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserBO setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserBO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserface() {
        return userface;
    }

    public UserBO setUserface(String userface) {
        this.userface = userface;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public UserBO setRemark(String remark) {
        this.remark = remark;
        return this;
    }
}
