package ru.alvisid.ws.productmicroservice.controller;

import java.time.LocalDateTime;

public class ErrorMessage {
    private LocalDateTime time;
    private String message;

    public ErrorMessage(LocalDateTime time, String message) {
        this.time = time;
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
