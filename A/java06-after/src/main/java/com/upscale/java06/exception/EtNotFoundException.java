package com.upscale.java06.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EtNotFoundException extends RuntimeException{
    public EtNotFoundException(String message) {
        super(message);
    }
}
