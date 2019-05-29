package com.guocai.manager.service.impl;

import com.guocai.manager.entity.User;
import com.guocai.manager.mapper.UserMapper;
import com.guocai.manager.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-05-29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
