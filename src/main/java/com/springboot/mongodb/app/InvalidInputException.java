package com.springboot.mongodb.app;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidInputException extends ResponseStatusException {
    private static final long serialVersionUID = 1L;

    public InvalidInputException(HttpStatus status, String message) {
        super(status, message);
    }
}
