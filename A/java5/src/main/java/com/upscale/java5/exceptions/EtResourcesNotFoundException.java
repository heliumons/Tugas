package com.upscale.java5.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EtResourcesNotFoundException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 2833853055730408839L;

    public EtResourcesNotFoundException(String message) {
        super(message);
    }
}
