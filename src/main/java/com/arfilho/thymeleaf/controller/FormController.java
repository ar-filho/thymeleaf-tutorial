package com.arfilho.thymeleaf.controller;

import com.arfilho.thymeleaf.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class FormController {

    // handler method to handle user registration page request
    @GetMapping("register")
    public String userRegistrationPage(Model model) {
        // Empty UserForm object to store form data
        UserForm userForm = new UserForm();
        model.addAttribute("userForm", userForm);

        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("listProfession", listProfession);
        return "register-form";
    }
}
