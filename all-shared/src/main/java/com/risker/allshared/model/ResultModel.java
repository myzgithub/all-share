package com.risker.allshared.model;

import com.risker.allshared.enums.ResultCodeEnum;

import java.io.Serializable;

/**
 * Created by myz on 16/8/28.
 */
public abstract class ResultModel<T> implements Serializable{

    protected ResultCodeEnum code = ResultCodeEnum.SUCCESS;

    protected String message = "success";

    protected T model;

    public ResultCodeEnum getCode() {
        return code;
    }

    protected void setCode(ResultCodeEnum code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

    public T getModel() {
        return model;
    }

    protected void setModel(T model) {
        this.model = model;
    }
}
