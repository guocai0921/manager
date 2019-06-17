package com.guocai.manager.workerId;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * java类简单作用描述
 *
 * @ClassName: WorkId
 * @Package: com.guocai.msnp.workerId
 * @Description: 为外部提供生成ID的工具类
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-04-28-10:42
 */
public class WorkId {

    public static String nextId() {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        String nextId = String.valueOf(idWorker.nextId());
        return nextId;
    }

    public static void main(String[] args) {
        System.out.println(WorkId.nextId());
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encode = encoder.encode("pass1234");
        System.out.println(encode);
    }

}
