package com.guocai.manager.mapper;

import com.guocai.manager.entity.Menu;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-13
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> getAllMenu();
}
