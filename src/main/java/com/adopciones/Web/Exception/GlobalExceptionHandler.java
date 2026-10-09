
package com.adopciones.Web.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.adopciones.Domain.Exceptions.NotFoundException;

@RestControllerAdvice 
public class GlobalExceptionHandler {
    
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Error> handleNotFoundException(NotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new Error(ex.getMessage(), "NOT_FOUND"));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Error(ex.getMessage(), "INTERNAL_SERVER_ERROR"));
    }
}
