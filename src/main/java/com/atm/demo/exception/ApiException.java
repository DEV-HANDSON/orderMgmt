package com.atm.demo.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {


    public String getMessage() {
        return message;
    }

    private final String message;

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getZonedDateTime() {
        return zonedDateTime;
    }

    private final HttpStatus httpStatus;
    private final ZonedDateTime zonedDateTime;

    public ApiException(String message,
                        HttpStatus httpStatus,
                        ZonedDateTime zonedDateTime) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.zonedDateTime = zonedDateTime;
    }


}
