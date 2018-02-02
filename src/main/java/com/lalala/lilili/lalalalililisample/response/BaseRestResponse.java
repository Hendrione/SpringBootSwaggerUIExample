package com.lalala.lilili.lalalalililisample.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseRestResponse<T> {
    public BaseRestResponse(boolean success, String errorMessage, T content, PageMetaData pageMetaData) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.content = content;
        this.pageMetaData = pageMetaData;
    }

    public BaseRestResponse(boolean success, String errorMessage, T content) {
        this.success = success;
        this.errorMessage = errorMessage;
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Object getContent() {
        return content;
    }

    public PageMetaData getPageMetaData() {
        return pageMetaData;
    }

    public void setContent(T content) {
        this.content = content;
    }

    private boolean success;
    private String errorMessage;
    private T content;
    private PageMetaData pageMetaData;
}