package com.guocai.manager.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.guocai.manager.bo.EmployeeBO;
import com.guocai.manager.entity.Employee;
import com.baomidou.mybatisplus.service.IService;
import com.guocai.manager.entity.Nation;
import com.guocai.manager.entity.PoliticsStatus;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-14
 */
public interface IEmployeeService extends IService<Employee> {
    List<Nation> getAllNations();
    List<PoliticsStatus> getAllPolitics();
    Page<Employee> getEmployeeByPage(EmployeeBO employee);
    Long getMaxWorkID();
    List<Employee> getAllEmployee();
}
