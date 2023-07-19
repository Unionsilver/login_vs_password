package com.example.login_vs_password;

public class WrongLoginException extends RuntimeException {
public  WrongLoginException(String message) {
    super(message);
}
}

