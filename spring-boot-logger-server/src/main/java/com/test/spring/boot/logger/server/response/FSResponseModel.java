package com.test.spring.boot.logger.server.response;

import java.io.Serializable;

public class FSResponseModel<T> implements Serializable {

    private static final long serialVersionID = 32321323144242414L;

    private String code;

    private String msg;

    private T date;

    public  FSResponseModel(){
        this.code="000000";
        this.msg="success";
    }

    public FSResponseModel(String code, String msg, T date) {
        this.code = code;
        this.msg = msg;
        this.date = date;
    }

    public FSResponseModel(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.date = null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }
}
