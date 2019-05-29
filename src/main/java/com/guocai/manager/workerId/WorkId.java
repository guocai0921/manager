package com.guocai.manager.workerId;

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

}
