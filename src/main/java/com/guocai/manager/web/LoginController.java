package com.guocai.manager.web;

import com.guocai.manager.base.ResponseMessage;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * java类简单作用描述
 *
 * @ClassName: LoginController
 * @Package: com.guocai.manager.web
 * @Description: 登录接口的Controller
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-07 20:20
 */
@RestController
public class LoginController {

    @RequestMapping("/login_p")
    public ResponseMessage login() {
        return ResponseMessage.error("尚未登录，请登录!");
    }

    @PostMapping("/login_user")
    @Transactional
    @ApiOperation(value = "用户信息维护添加接口", notes = "用户信息维护添加接口", httpMethod = "POST")
    @ApiImplicitParams({
            // @ApiImplicitParam(name = "access_token", value = "请求token", required = true, paramType = "header", dataType = "String"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "用户登录操作成功！", response = ResponseMessage.class),
            @ApiResponse(code = 500, message = "用户登录操作失败！")
    })
    public ResponseMessage login(@RequestParam String username, @RequestParam String password) {
        System.out.println(username + "<--->" + password);
        return ResponseMessage.ok("登录成功!");
    }
}
