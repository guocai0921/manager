package com.guocai.manager.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.guocai.manager.bo.EmployeeBO;
import com.guocai.manager.entity.Employee;
import com.guocai.manager.entity.Nation;
import com.guocai.manager.entity.PoliticsStatus;
import com.guocai.manager.mapper.EmployeeMapper;
import com.guocai.manager.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Nation> getAllNations() {
        return employeeMapper.getAllNations();
    }

    @Override
    public List<PoliticsStatus> getAllPolitics() {
        return employeeMapper.getAllPolitics();
    }

    @Override
    public Page<Employee> getEmployeeByPage(EmployeeBO employee) {
        Page<Employee> page = new Page<>(employee.getPage(), employee.getSize());
        List<Employee> employeeByPage = employeeMapper.getEmployeeByPage(page, employee);
        return page.setRecords(employeeByPage);
    }

    @Override
    public Long getMaxWorkID() {
        return employeeMapper.getMaxWorkID();
    }

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeByPage = employeeMapper.getAllEmployee();
        return employeeByPage;
    }


}
