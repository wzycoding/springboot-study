package com.springboot.exception;

import com.springboot.result.ErrorEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalException extends RuntimeException {
    private ErrorEnum errorEnum;
}
