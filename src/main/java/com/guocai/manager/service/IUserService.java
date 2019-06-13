package com.guocai.manager.service;

import com.baomidou.mybatisplus.service.IService;
import com.guocai.manager.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-05-29
 */
public interface IUserService extends IService<User> ,UserDetailsService {

}
