package com.guocai.manager.mapper;

import com.guocai.manager.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Mht
 * @since 2019-05-29
 */
public interface UserMapper extends BaseMapper<User> {
    User loadUserByUsername(String username);
}
