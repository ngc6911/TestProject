package com.test.testproject.data.remote.responses;

public class Response<T> {
    private int code;
    private T message;

    public Response(int code, T message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public T getMessage() {
        return message;
    }

}
