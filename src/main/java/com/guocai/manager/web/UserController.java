package com.guocai.manager.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.guocai.manager.base.ResponseMessage;
import com.guocai.manager.bo.UserBO;
import com.guocai.manager.entity.User;
import com.guocai.manager.service.IUserService;
import com.guocai.manager.workerId.WorkId;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import javax.validation.Valid;

/**
 * java类简单作用描述
 *
 * @ClassName: UserController
 * @Package: com.guocai.manager.web
 * @Description: 用户接口
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-05-29 16:42
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户信息操作")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @GetMapping("/list")
    @ApiOperation(value = "用户信息列表查询接口", notes = "用户信息列表查询接口", httpMethod = "GET", response = User.class)
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
            @ApiImplicitParam(name = "pageNo", value = "分页页码\n(例:1)", required = true, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小\n(例:10)", required = true, paramType = "query", dataType = "Integer"),
            @ApiImplicitParam(name = "userName", value = "用户名\n(例:张三)", required = false, paramType = "query", dataType = "String"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "查询医院操作成功！", response = User.class),
            @ApiResponse(code = 500, message = "查询医院操作失败！")
    })
    public ResponseMessage getUserList(@ApiIgnore @Valid UserBO userBO) {
        EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
        entityWrapper.like("username", userBO.getUsername());
        Page<User> users = iUserService.selectPage(new Page<>(userBO.getPageNo(), userBO.getPageSize()), entityWrapper);
        return ResponseMessage.ok("查询用户信息成功!", users);
    }


    @Transactional
    @PostMapping("/addUser")
    @ApiOperation(value = "用户信息维护添加接口", notes = "用户信息维护添加接口", httpMethod = "POST", response = User.class)
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "添加用户信息操作成功！", response = ResponseMessage.class),
            @ApiResponse(code = 500, message = "添加用户信息操作失败！")
    })
    public ResponseMessage addUser(@RequestBody User user) {
        boolean flag = iUserService.insert(user.setId(WorkId.nextId()));
        return ResponseMessage.ok("添加用户信息成功!", flag);
    }

    @Transactional
    @PutMapping("/editUser")
    @ApiOperation(value = "用户信息维护修改接口", notes = "用户信息维护修改接口", httpMethod = "PUT", response = User.class)
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "修改用户信息操作成功！", response = ResponseMessage.class),
            @ApiResponse(code = 500, message = "修改用户信息操作失败！")
    })
    public ResponseMessage editUser(@RequestBody User user) {
        boolean flag = iUserService.updateById(user);
        return ResponseMessage.ok("修改用户信息成功!", flag);
    }

    @Transactional
    @DeleteMapping("/deleteUser")
    @ApiOperation(value = "用户信息维护删除接口", notes = "用户信息维护删除接口", httpMethod = "DELETE", response = String.class)
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
            @ApiImplicitParam(name = "id", value = "用户ID\n(例:583326487252303872)", required = true, paramType = "query", dataType = "String")
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "删除用户信息操作成功！", response = ResponseMessage.class),
            @ApiResponse(code = 500, message = "删除用户信息操作失败！")
    })
    public ResponseMessage deleteUser(@ApiIgnore @Valid User user) {
        boolean flag = iUserService.deleteById(user.getId());
        return ResponseMessage.ok("删除用户信息成功!", flag);
    }



}
