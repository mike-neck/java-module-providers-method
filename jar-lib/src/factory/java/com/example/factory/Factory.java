package com.example.factory;

import com.example.api.Message;

public class Factory {

    public static Message provider() {
        return () -> "factory";
    }
}
