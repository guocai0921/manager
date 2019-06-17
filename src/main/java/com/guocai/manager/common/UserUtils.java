package com.guocai.manager.common;

import com.guocai.manager.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * java类简单作用描述
 *
 * @ClassName: UserUtils
 * @Package: com.guocai.manager.common
 * @Description: 用户工具类
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-06-14 9:13
 */
public class UserUtils {
    public static User getCurrentHr() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
