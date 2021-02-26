package com.example.app;

import com.example.api.Message;
import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        for (Message message : ServiceLoader.load(Message.class)) {
            String output = String.format("[%s] %s", message.getClass(), message.message());
            System.out.println(output);
        }
    }
}
