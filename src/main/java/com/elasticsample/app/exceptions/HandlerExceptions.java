package com.elasticsample.app.exceptions;


import com.elasticsample.app.domain.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class HandlerExceptions {

    @ExceptionHandler(value= MyException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorDTO handleMyException(MyException exception) {

        return ErrorDTO.builder().code(exception.getStatusCode()).description(exception.getMessage()).build();
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public @ResponseBody ErrorDTO handleBadRequestParameter(
            MissingServletRequestParameterException exception) {
        return ErrorDTO.builder().code(4).description(exception.getMessage()).build();
    }


}
