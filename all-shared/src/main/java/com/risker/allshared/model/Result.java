package com.risker.allshared.model;

import com.risker.allshared.enums.ResultCodeEnum;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by myz on 16/8/29.
 */
public abstract class Result implements Serializable{

    /**
     * 调用返回码
     */
    private ResultCodeEnum code = ResultCodeEnum.SUCCESS;

    /**
     * 调用信息
     */
    private Map<String,String> infoMap = new HashMap<String, String>();

    /**
     * 错误信息
     */
    private String errorMessage;

    public ResultCodeEnum getCode() {
        return code;
    }

    public void setCode(ResultCodeEnum code) {
        this.code = code;
    }

    /**
     * 判断成功返回的标志
     * @return
     */
    public boolean isSuccess(){

        return ResultCodeEnum.SUCCESS.equals(code);
    }

    public Map<String, String> getInfoMap() {
        return infoMap;
    }

    public void setInfoMap(Map<String, String> infoMap) {
        this.infoMap = infoMap;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * 同时也将其放入到infoMap中
     * @param errorMessage
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
