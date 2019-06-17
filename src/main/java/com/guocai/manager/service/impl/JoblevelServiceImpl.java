package com.guocai.manager.service.impl;

import com.guocai.manager.entity.Joblevel;
import com.guocai.manager.mapper.JoblevelMapper;
import com.guocai.manager.service.IJoblevelService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-14
 */
@Service
public class JoblevelServiceImpl extends ServiceImpl<JoblevelMapper, Joblevel> implements IJoblevelService {

    @Autowired
    private JoblevelMapper joblevelmapper;

    @Override
    public List<Joblevel> getAllJobLevels() {
        return joblevelmapper.getAllJobLevels();
    }
}
