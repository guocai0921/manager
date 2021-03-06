package com.guocai.manager.base;

import java.io.Serializable;

/**
 * java类简单作用描述
 *
 * @ClassName: Pager
 * @Package: com.guocai.manager.bo
 * @Description:
 * @Author: Sun GuoCai
 * @Version: 1.0
 * @Create: 2019-05-29 16:02
 */
public class Pager<T> implements Serializable {
    private Integer pageNo;
    private Integer pageSize;
    private Integer page;
    private Integer size;

    public Integer getPageNo() {
        return pageNo;
    }

    public Pager setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Pager setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getPage() {
        return page;
    }

    public Pager setPage(Integer page) {
        this.page = page;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public Pager setSize(Integer size) {
        this.size = size;
        return this;
    }
}
