package com.example.demo.iterceptor;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.dto.response.ResponseDto;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    protected ResponseEntity<ResponseDto> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
    	log.info("okokokokokokok");
    	String mess = null;
        for (ObjectError error : ex.getBindingResult().getAllErrors()) {
            mess = String.format(Objects.requireNonNull(error.getDefaultMessage()), ((FieldError) error).getField());
        }
        
    	ResponseDto responseDto = new ResponseDto("123");
    	responseDto.getMeta().setCode(401000);
    	responseDto.getMeta().setMessage(mess);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseDto);
    }

}
