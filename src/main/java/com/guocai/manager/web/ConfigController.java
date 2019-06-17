package com.guocai.manager.web;

import com.guocai.manager.common.UserUtils;
import com.guocai.manager.entity.Menu;
import com.guocai.manager.entity.User;
import com.guocai.manager.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * java类简单作用描述
 *
 * @ClassName: ConfigController
 * @Package: com.guocai.manager.web
 * @Description: 获取一些配置信息
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-14 15:52
 */
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    IMenuService menuService;
    @GetMapping("/sysmenu")
    public List<Menu> sysmenu() {
        return menuService.getMenusByUserId();
    }

    @RequestMapping("/hr")
    public User currentUser() {
        return UserUtils.getCurrentHr();
    }
}
