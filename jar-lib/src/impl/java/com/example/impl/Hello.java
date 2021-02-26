package com.example.impl;

import com.example.api.Message;

public class Hello implements Message {
    @Override
    public String message() {
        return "hello";
    }
}
