package com.lalala.lilili.lalalalililisample.response;

/**
 * Created by argo.triwidodo on 20/12/2016.
 */
public class PageMetaData {

    private int pageSize;
    private int pageNumber;
    private int total;

    public PageMetaData(int pageNumber, int pageSize, int total) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getTotal() {
        return total;
    }

}
