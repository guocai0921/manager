package com.guocai.manager.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.guocai.manager.bo.EmployeeBO;
import com.guocai.manager.entity.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.guocai.manager.entity.Nation;
import com.guocai.manager.entity.PoliticsStatus;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-06-14
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
    List<Nation> getAllNations();
    List<PoliticsStatus> getAllPolitics();
    List<Employee> getEmployeeByPage(Pagination page, EmployeeBO employee);
    Long getMaxWorkID();
    List<Employee> getAllEmployee();
}
