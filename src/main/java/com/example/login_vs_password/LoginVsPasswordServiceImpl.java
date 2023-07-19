package com.example.login_vs_password;

import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class LoginVsPasswordServiceImpl implements LoginVsPasswordService {
    private static final Pattern REGEX = Pattern.compile("^[a-zA-Z0-9_]{1,20}$");

    @Override
    public void loginSetting(String login, String password, String confirmPassword) {

        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException("BOOOM");
        }
        if ((!password.matches("^[a-zA-Z0-9_]{1,20}$"))) {
            throw new WrongPasswordException("BOOOM2");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("BOOOOM3");
        }
    }
}


