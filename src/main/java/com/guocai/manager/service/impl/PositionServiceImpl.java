package com.guocai.manager.service.impl;

import com.guocai.manager.entity.Position;
import com.guocai.manager.mapper.PositionMapper;
import com.guocai.manager.service.IPositionService;
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
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public List<Position> getAllPos() {
        return positionMapper.getAllPos();
    }
}
