package com.example.accessingdatamysql.Response;

import java.util.HashMap;

public class Response {

    private final Integer code;
    private final String message;
    private final HashMap<String, String> data;

    public Response(Integer code, String message, HashMap<String, String> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public HashMap<String, String> getData() {
        return data;
    }

    public Integer getCode() {
        return code;
    }
}