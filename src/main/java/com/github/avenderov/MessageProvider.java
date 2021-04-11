package com.github.avenderov;

import jakarta.inject.Singleton;

@Singleton
public class MessageProvider {

    public String getMessage() {
        return "Hello, World!";
    }
}
