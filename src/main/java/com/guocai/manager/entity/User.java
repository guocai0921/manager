package com.guocai.manager.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-07
 */
@TableName("sgc_user")
@ApiModel(value = "User", description ="用户信息")
public class User extends Model<User> implements UserDetails {

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
    private boolean enabled;

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


    private List<Role> roles;


    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getTelephone() {
        return telephone;
    }

    public User setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public User setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserface() {
        return userface;
    }

    public User setUserface(String userface) {
        this.userface = userface;
        return this;
    }

    public String getRemark() {
        return remark;
    }

    public User setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
