package com.risker.allshared.enums;

/**
 * Created by myz on 16/8/28.
 */
public enum ResultCodeEnum {

    FAIL(0),SUCCESS(1),TIME_OUT(2),PARAM_ERROR(3),EXCEPTION(4),OTHTER(99);

    private int code;

    private ResultCodeEnum(int code){
        this.code = code;
    }
}
