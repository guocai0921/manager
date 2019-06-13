package com.guocai.manager.service;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;
/**
 * java类简单作用描述
 *
 * @ClassName: PictureService
 * @Package: com.guocai.manager.service
 * @Description: 图片上传接口
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-06 16:26
 */
public interface IPictureService {
    Map<Object,Object> uploadPicture(MultipartFile uploadFile);
}
