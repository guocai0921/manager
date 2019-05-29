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

    /**
     * Response 消息
     */
    private String message;

    /**
     * Response 状态码
     */
    private String status;

    /**
     * Response 数据
     */
    private Object data;

    /**
     * 通话令牌
     */
    private String token;

    private String index;
    private String total;
    private String persize;
    private String totalPages;
    private String uuid;
    private String phoneVCode;

    public static ResponseMessage build() {
        return new ResponseMessage();
    }

    public String toJSON() {

        StringBuffer sb = new StringBuffer();
        sb.append("{");

        if (StringUtils.isNotBlank(this.status)) {
            sb.append("\"status\":\"").append(status).append("\",");
        }
        if (StringUtils.isNotBlank(this.message)) {
            sb.append("\"message\":\"").append(message).append("\",");
        }
        if (StringUtils.isNotBlank(this.token)) {
            sb.append("\"token\":\"").append(token).append("\",");
        }
        if (StringUtils.isNotBlank(this.uuid)) {
            sb.append("\"uuid\":\"").append(uuid).append("\",");
        }
        if (StringUtils.isNotBlank(this.phoneVCode)) {
            sb.append("\"phoneVCode\":\"").append(phoneVCode).append("\",");
        }
        if (this.data != null) {
            JsonMapper jm = new JsonMapper();
            sb.append("\"data\":").append(jm.toJson(data)).append(",");
        }
        if (StringUtils.isNotBlank(this.index)) {
            sb.append("\"index\":\"").append(index).append("\",");
        }
        if (StringUtils.isNotBlank(this.total)) {
            sb.append("\"total\":\"").append(total).append("\",");
        }
        if (StringUtils.isNotBlank(this.persize)) {
            sb.append("\"persize\":\"").append(persize).append("\",");
        }
        if (StringUtils.isNotBlank(this.totalPages)) {
            sb.append("\"totalPages\":\"").append(totalPages).append("\",");
        }

        sb.append("}");
        String result = sb.toString();
        if (result.lastIndexOf(",") == -1) {
            return result;
        }
        return result.substring(0, result.lastIndexOf(",")).concat(result.substring(result.lastIndexOf(",") + 1));
    }

    public String toJSON(String withEmptyStr) {
        StringBuffer sb = new StringBuffer();
        sb.append("{");

        if (StringUtils.isNotBlank(this.status)) {
            sb.append("\"status\":\"").append(status).append("\",");
        }
        if (StringUtils.isNotBlank(this.message)) {
            sb.append("\"message\":\"").append(message).append("\",");
        }
        if (StringUtils.isNotBlank(this.token)) {
            sb.append("\"token\":\"").append(token).append("\",");
        }
        if (StringUtils.isNotBlank(this.uuid)) {
            sb.append("\"uuid\":\"").append(uuid).append("\",");
        }
        if (StringUtils.isNotBlank(this.phoneVCode)) {
            sb.append("\"phoneVCode\":\"").append(phoneVCode).append("\",");
        }
        if (this.data != null) {
            JsonMapper jm = new JsonMapper();
            sb.append("\"data\":").append(jm.toJsonWithEmptyStr(data)).append(",");
        }
        if (StringUtils.isNotBlank(this.index)) {
            sb.append("\"index\":\"").append(index).append("\",");
        }
        if (StringUtils.isNotBlank(this.total)) {
            sb.append("\"total\":\"").append(total).append("\",");
        }
        if (StringUtils.isNotBlank(this.persize)) {
            sb.append("\"persize\":\"").append(persize).append("\",");
        }
        if (StringUtils.isNotBlank(this.totalPages)) {
            sb.append("\"totalPages\":\"").append(totalPages).append("\",");
        }

        sb.append("}");
        String result = sb.toString();
        return result.substring(0, result.lastIndexOf(",")).concat(result.substring(result.lastIndexOf(",") + 1));

    }

    public String getStatus() {
        return status;
    }

    public ResponseMessage setStatus(String status) {
        this.status = status;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ResponseMessage setData(Object data) {
        this.data = data;
        return this;
    }

    public String getIndex() {
        return index;
    }

    public ResponseMessage setIndex(String index) {
        this.index = index;
        return this;
    }

    public String getTotal() {
        return total;
    }

    public ResponseMessage setTotal(String total) {
        this.total = total;
        return this;
    }

    public String getPersize() {
        return persize;
    }

    public ResponseMessage setPersize(String persize) {
        this.persize = persize;
        return this;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public ResponseMessage setTotalPages(String totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getToken() {
        return token;
    }

    public ResponseMessage setToken(String token) {
        this.token = token;
        return this;
    }

    public String getUuid() {
        return uuid;
    }

    public ResponseMessage setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public String getPhoneVCode() {
        return phoneVCode;
    }

    public ResponseMessage setPhoneVCode(String phoneVCode) {
        this.phoneVCode = phoneVCode;
        return this;
    }
}
