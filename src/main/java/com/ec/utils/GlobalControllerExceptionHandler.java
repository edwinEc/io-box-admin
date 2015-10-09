package com.ec.utils;

import com.ec.base.model.Result;
import com.ec.exception.BusinessException;
import com.fasterxml.jackson.annotation.JsonView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: chaocui200783
 * Date: 14-10-30
 * Time: 上午11:37
 */
@ControllerAdvice(annotations = RestController.class)
public class GlobalControllerExceptionHandler {

    private static Logger logger = LogManager.getLogger(GlobalControllerExceptionHandler.class.getName());

    @ExceptionHandler(BusinessException.class)
    @JsonView(Result.ResultView.class)
    public @ResponseBody
    Result handleException(BusinessException e) {
        try{
            return new Result(e.getErrorCode(),e.getErrorMsg());
        }finally {
            logger.error("BusinessException:",e);
        }
    }

    @ExceptionHandler(Exception.class)
    @JsonView(Result.ResultView.class)
    public @ResponseBody
    Result handleException(Exception e) {
        try{
            return new Result(-1,"unknown error");
        }finally {
            logger.error("Exception:",e);
        }
    }
}
