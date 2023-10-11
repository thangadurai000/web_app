package com.oasys.employee.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Exception.salaryNotFoundException;

@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(salaryNotFoundException.class)
public ResponseEntity<Object> salaryhandler(salaryNotFoundException m1){
	return new ResponseEntity<Object>(m1.getMessage(),HttpStatus.NOT_FOUND);
}





}
