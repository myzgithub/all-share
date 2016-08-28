package com.risker.allshared.model;

import com.risker.allshared.enums.ResultCodeEnum;

import java.io.Serializable;

/**
 * Created by myz on 16/8/28.
 */
public class ResultModel<T> implements Serializable{

    public ResultCodeEnum code = ResultCodeEnum.SUCCESS;

    public String message = "success";

    public T model;

    public ResultCodeEnum getCode() {
        return code;
    }

    public void setCode(ResultCodeEnum code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
