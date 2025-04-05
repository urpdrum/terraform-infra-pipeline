//package br.com.hackathon.controller;
//
//
//import jakarta.ws.rs.NotFoundException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class RestControllerHandler {
//
//	@ExceptionHandler(NotFoundException.class)
//	public ResponseEntity<String> handleNotFound(final NotFoundException ex) {
//		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
//	}
//}
