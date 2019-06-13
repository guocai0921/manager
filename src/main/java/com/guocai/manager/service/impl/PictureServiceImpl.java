package com.guocai.manager.service.impl;

import com.guocai.manager.common.FtpUtil;
import com.guocai.manager.common.IDUtils;
import com.guocai.manager.service.IPictureService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.joda.time.DateTime;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * java类简单作用描述
 *
 * @ClassName: PictureServiceImpl
 * @Package: com.guocai.manager.service.impl
 * @Description: 图片上传实现类
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-06 16:28
 */
@Service
public class PictureServiceImpl implements IPictureService {

    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;

    @Value("${FTP_PORT}")
    private Integer FTP_PORT;

    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;

    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;

    @Value("${FTP_BASE_BATH}")
    private String FTP_BASE_BATH;

    @Value("${IMAGES_BASE_URL}")
    private String IMAGES_BASE_URL;

    @Override
    public Map<Object, Object> uploadPicture(MultipartFile uploadFile) {
        Map<Object, Object> result = new HashMap<>();
        try {
            // TODO Auto-generated method stub
            String oldName = uploadFile.getOriginalFilename();
            // 生成新的文件名
            String imageName = IDUtils.genImageName();
            String newName = imageName + oldName.substring(oldName.indexOf("."));

            String imagePath = new DateTime().toString("/yyyy/MM/dd");
            // 开始文件上传
            boolean flag = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_BATH, imagePath, newName, uploadFile.getInputStream());
            // 上传失败
            if(! flag) {
                result.put("error", 1);
                result.put("mseeage", "文件上传失败!");
                return result;
            }
            // 上传成功
            result.put("error", 0);
            result.put("url", IMAGES_BASE_URL + imagePath + "/" + newName);
            return result;
        } catch (IOException e) {
            // 上传发生异常
            result.put("error", 1);
            result.put("mseeage", "文件上传发生异常!");
            e.printStackTrace();
            return result;
        }
    }
}
