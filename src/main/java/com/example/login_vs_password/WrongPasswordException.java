package com.example.login_vs_password;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);

    }
}

