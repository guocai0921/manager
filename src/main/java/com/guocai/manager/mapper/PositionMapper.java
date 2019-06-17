package com.guocai.manager.mapper;

import com.guocai.manager.entity.Position;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-14
 */
public interface PositionMapper extends BaseMapper<Position> {
    List<Position> getAllPos();
}
