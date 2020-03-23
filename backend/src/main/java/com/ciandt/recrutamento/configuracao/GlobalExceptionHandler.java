package com.ciandt.recrutamento.configuracao;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ApiError> handleException(Exception exception) {

        if (exception instanceof FeignException.NotFound) {
            return ResponseEntity.status(NOT_FOUND).body(ApiError.of(exception.getMessage()));
        }

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ApiError.of(exception.getMessage()));

    }

    public static class ApiError {

        private List<String> messages = new ArrayList<>();

        public static ApiError of(List<String> messages) {
            return new ApiError(messages);
        }

        public static ApiError of(String messages) {
            return new ApiError(Arrays.asList(messages));
        }

        private ApiError(List<String> messages) {
            this.messages.addAll(messages);
        }

        public List<String> getMessages() {
            return messages;
        }
    }
}
