package com.kavindu.netflixclone.exceptionhandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kavindu.netflixclone.exceptions.MovieDetailsNotFoundException;

@ControllerAdvice
public class MovieExceptionHandler {

    @ExceptionHandler(value = MovieDetailsNotFoundException.class)
    public ResponseEntity HandleMovieDetailsNotFoundException(){
        return new ResponseEntity("Movie with passed id does not exists", HttpStatus.BAD_REQUEST);
    }
}
