package com.github.youssfbr.sistema.controllers.exceptions;

import com.github.youssfbr.sistema.models.Response;
import com.github.youssfbr.sistema.services.exceptions.ObjectNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceHandler {

    private static final HttpStatus STATUS_NOT_FOUND = HttpStatus.NOT_FOUND;

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<Response<String>> objectNotFoundException(ObjectNotFoundException e) {

        Response<String> response = new Response<>();
        response.setStatusCode(STATUS_NOT_FOUND.value());
        response.setData(e.getMessage());

        return ResponseEntity.status(STATUS_NOT_FOUND).body(response);
    }

}
