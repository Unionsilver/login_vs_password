package com.example.login_vs_password;

import org.springframework.stereotype.Service;

@Service
public class LoginVsPasswordServiceImpl implements LoginVsPasswordService {

    public String loginSetting(String login, String password, String confirmPassword) {
        try {
            if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongLoginException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
            if ((!password.matches("^[a-zA-Z0-9_]{1,20}$"))) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
        return login;
    }
}

