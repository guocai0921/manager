package com.guocai.manager.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java类简单作用描述
 *
 * @ClassName: CustomDateConverter
 * @Package: com.guocai.manager.config
 * @Description:
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-15 18:20
 */
@Component
public class CustomDateConverter  implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
