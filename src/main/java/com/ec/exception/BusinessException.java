package com.ec.exception;

import com.ec.utils.ErrorCodeUtils;
import com.fasterxml.jackson.annotation.JsonView;

/**
 * User: chaocui200783
 * Date: 14-12-10
 * Time: 下午3:10
 */
public class BusinessException extends Exception{

    private int errorCode;
    private String errorMsg;

    public BusinessException(int errorCode){
          this.errorCode = errorCode;
          this.errorMsg  =  ErrorCodeUtils.getErrorMsg(errorCode);
          if(errorMsg==null){
              this.errorMsg = "undefined error";
          }
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

}
