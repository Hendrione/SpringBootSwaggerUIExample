package com.lalala.lilili.lalalalililisample.response;

public class BaseResponse extends BaseRestResponse<Object> {
    public BaseResponse(boolean success, String errorMessage, Object content, PageMetaData pageMetaData) {
        super(success, errorMessage, content, pageMetaData);
    }

    public BaseResponse(boolean success, String errorMessage, Object content) {
        super(success, errorMessage, content);
    }
}

