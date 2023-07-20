package com.example.login_vs_password;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sign")
public class LoginVsPasswordController {


    private final LoginVsPasswordService loginVsPasswordService;

    public LoginVsPasswordController(LoginVsPasswordService loginVsPasswordService) {
        this.loginVsPasswordService = loginVsPasswordService;
    }

    @GetMapping(path = "/login")
    public String loginSetting(@RequestParam String login,
                               @RequestParam String password,
                               @RequestParam String confirmPassword) {
        try {
            loginVsPasswordService.loginSetting(login, password, confirmPassword);
            return "Логин выполнен успешно";
        } catch (WrongLoginException | WrongPasswordException ex) {
            return ex.getMessage();
        }

    }
}




