package com.guocai.manager.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.guocai.manager.base.ResponseMessage;
import com.guocai.manager.bo.DeptBO;
import com.guocai.manager.entity.Dept;
import com.guocai.manager.service.IDeptService;
import com.guocai.manager.workerId.WorkId;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Sun GuoCai
 * @since 2019-05-30
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private IDeptService iDeptService;

    @GetMapping("/list")
    @ApiOperation(value = "部门信息列表查询接口", notes = "部门信息列表查询接口", httpMethod = "GET", response = Dept.class)
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
            @ApiImplicitParam(name = "pageNo", value = "分页页码\n(例:1)", required = true, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小\n(例:10)", required = true, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "deptName", value = "用户名\n(例:张三)", required = false, paramType = "query", dataType = "String"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "查询部门信息操作成功！", response = Dept.class),
            @ApiResponse(code = 500, message = "查询部门信息操作失败！")
    })
    public ResponseMessage getDeptList (@ApiIgnore @Valid DeptBO deptBO) {
        EntityWrapper<Dept> entityWrapper = new EntityWrapper<Dept>();
        entityWrapper.like("dept_name", deptBO.getDeptName());
        entityWrapper.orderBy("dept_id");
        Page<Dept> depts = iDeptService.selectPage(new Page<>(deptBO.getPageNo(), deptBO.getPageSize()), entityWrapper);
        return ResponseMessage.build().setData(depts);
    }

    @Transactional
    @PostMapping("/addDept")
    @ApiOperation(value = "部门信息维护添加接口", notes = "部门信息维护添加接口", httpMethod = "POST", response = Dept.class)
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "添加部门信息操作成功！", response = ResponseMessage.class),
            @ApiResponse(code = 500, message = "添加部门信息操作失败！")
    })
    public ResponseMessage addUser(@RequestBody Dept dept) {
        boolean flag = iDeptService.insert(dept.setDeptId(WorkId.nextId()));
        return ResponseMessage.build().setData(flag);
    }

}
