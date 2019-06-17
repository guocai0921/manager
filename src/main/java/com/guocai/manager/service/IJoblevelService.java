package com.guocai.manager.service;

import com.guocai.manager.entity.Joblevel;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-14
 */
public interface IJoblevelService extends IService<Joblevel> {
    List<Joblevel> getAllJobLevels();
}
