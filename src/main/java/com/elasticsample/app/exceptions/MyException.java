package com.elasticsample.app.exceptions;


import lombok.Getter;

import java.io.Serial;

@Getter
public class MyException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int statusCode;


    public MyException(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

}
