package com.risker.allshared.model;

import com.risker.allshared.enums.ResultCodeEnum;

import java.io.Serializable;

/**
 * Created by myz on 16/8/28.
 */
public class ResultModel<T> extends Result{

    public T model;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
