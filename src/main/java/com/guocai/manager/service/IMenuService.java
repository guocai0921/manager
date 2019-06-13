package com.guocai.manager.service;

import com.guocai.manager.entity.Menu;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-13
 */
public interface IMenuService extends IService<Menu> {
    List<Menu> getAllMenu();
}
