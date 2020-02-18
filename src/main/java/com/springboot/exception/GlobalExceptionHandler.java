package com.springboot.exception;

import com.springboot.result.ErrorEnum;
import com.springboot.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e) {
        log.error(e.getMessage());
        if (e instanceof GlobalException) {
            GlobalException globalException = (GlobalException) e;
            return Result.error(globalException.getErrorEnum());
        } else {
            return Result.error(ErrorEnum.SERVER_ERROR);
        }
    }
}
