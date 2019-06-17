package com.guocai.manager.service.impl;

import com.guocai.manager.entity.Department;
import com.guocai.manager.mapper.DepartmentMapper;
import com.guocai.manager.service.IDepartmentService;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepByPid(String pid) {
        return departmentMapper.getDepByPid(pid);
    }

    @Override
    public List<Department> getAllDeps() {
        return departmentMapper.getAllDeps();
    }
}
