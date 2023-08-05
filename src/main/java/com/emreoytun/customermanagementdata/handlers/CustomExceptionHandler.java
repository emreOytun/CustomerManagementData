package com.emreoytun.customermanagementdata.handlers;

import com.emreoytun.customermanagementdata.dto.results.ErrorResult;
import com.emreoytun.customermanagementdata.exceptions.CustomException;
import com.emreoytun.customermanagementdata.exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResult> handleCustomerBusinessRulesException(CustomException exception) {
        ErrorResult result = new ErrorResult(exception.getMessage());
        return new ResponseEntity<>(result, exception.getHttpStatus());
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResult> handleEntityNotFoundException(EntityNotFoundException exception) {
        ErrorResult result = new ErrorResult(exception.getMessage());
        return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
    }
}
