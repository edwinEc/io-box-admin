package com.ec.base.model;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * User: chaocui200783
 * Date: 2015/1/28
 * Time: 18:04
 */
public class Result {

    public static Result SUCCESS = new Result(0,"success");

    public interface ResultView{}

    private int errorCode;
    private String errorMsg;

    public Result(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @JsonView(ResultView.class)
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @JsonView(ResultView.class)
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
