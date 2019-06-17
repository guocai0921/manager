package com.guocai.manager.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-13
 */
@TableName("sgc_menu")
public class Menu extends Model<Menu> {

    private static final long serialVersionUID = 1L;

    private String id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private String keepAlive;

    private String requireAuth;

    private String parentId;

    private Integer enabled;

    private List<Role> roles;

    private List<Menu> children;

    private MenuMeta meta;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }


    public String getKeepAlive() {
        return keepAlive;
    }

    public Menu setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    public String getRequireAuth() {
        return requireAuth;
    }

    public Menu setRequireAuth(String requireAuth) {
        this.requireAuth = requireAuth;
        return this;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public MenuMeta getMeta() {
        return meta;
    }

    public void setMeta(MenuMeta meta) {
        this.meta = meta;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Menu{" +
        "id=" + id +
        ", url=" + url +
        ", path=" + path +
        ", component=" + component +
        ", name=" + name +
        ", iconCls=" + iconCls +
        ", parentId=" + parentId +
        ", enabled=" + enabled +
        "}";
    }
}
