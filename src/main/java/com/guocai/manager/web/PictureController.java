package com.guocai.manager.web;

import com.guocai.manager.base.ResponseMessage;
import com.guocai.manager.service.IPictureService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * java类简单作用描述
 *
 * @ClassName: PictureController
 * @Package: com.guocai.manager.web
 * @Description: 图片上传Controller
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-06 16:25
 */
@RestController
@RequestMapping("/pic")
public class PictureController {
    @Autowired
    private IPictureService pictureService;


    @PostMapping(value = "/upload", consumes = "multipart/*", headers = "content-type=multipart/form-data")
    @ApiOperation(value = "上传图片")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "上传图片操作成功！", response = ResponseMessage.class),
            @ApiResponse(code = 500, message = "上传图片操作失败！")
    })
    public ResponseMessage uploadFile(MultipartFile uploadFile) {
        Map<Object, Object> map = pictureService.uploadPicture(uploadFile);
        return ResponseMessage.ok("上传图片成功", map);
    }
}
