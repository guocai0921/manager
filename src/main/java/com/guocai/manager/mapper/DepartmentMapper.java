package com.guocai.manager.mapper;

import com.guocai.manager.entity.Department;
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
public interface DepartmentMapper extends BaseMapper<Department> {
    List<Department> getDepByPid(String pid);
}
