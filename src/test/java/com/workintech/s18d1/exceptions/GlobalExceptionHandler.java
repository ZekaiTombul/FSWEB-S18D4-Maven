// com/workintech/s18d1/exceptions/GlobalExceptionHandler.java
package com.workintech.s18d1.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<BurgerErrorResponse> handleBurgerException(BurgerException exception) {
        log.error("BurgerException occurred: {}", exception.getMessage());
        BurgerErrorResponse response = new BurgerErrorResponse(exception.getMessage());
        return new ResponseEntity<>(response, exception.getHttpStatus());
    }

    @ExceptionHandler
    public ResponseEntity<BurgerErrorResponse> handleGenericException(Exception exception) {
        log.error("Unhandled exception: {}", exception.getMessage());
        BurgerErrorResponse response = new BurgerErrorResponse(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
