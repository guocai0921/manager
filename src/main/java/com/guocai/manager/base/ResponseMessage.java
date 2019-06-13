package com.guocai.manager.base;
import com.baomidou.mybatisplus.plugins.Page;
import org.apache.commons.lang3.StringUtils;

/**
 * java类简单作用描述
 *
 * @ClassName: ResponseMessage
 * @Package: com.guocai.manager.base
 * @Description: 响应对象
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-05-29 15:07
 */
public class ResponseMessage {
    private Integer status;
    private String msg;
    private Object obj;

    private ResponseMessage() {
    }

    public static ResponseMessage build() {
        return new ResponseMessage();
    }

    public static ResponseMessage ok(String msg, Object obj) {
        return new ResponseMessage(200, msg, obj);
    }

    public static ResponseMessage ok(String msg) {
        return new ResponseMessage(200, msg, null);
    }

    public static ResponseMessage error(String msg, Object obj) {
        return new ResponseMessage(500, msg, obj);
    }

    public static ResponseMessage error(String msg) {
        return new ResponseMessage(500, msg, null);
    }

    private ResponseMessage(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus() {

        return status;
    }

    public ResponseMessage setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResponseMessage setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public ResponseMessage setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}
