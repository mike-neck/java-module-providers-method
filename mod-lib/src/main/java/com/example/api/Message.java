package com.example.api;

public interface Message {

    String message();

    static Message provider() {
        return () -> "message";
    }
}
