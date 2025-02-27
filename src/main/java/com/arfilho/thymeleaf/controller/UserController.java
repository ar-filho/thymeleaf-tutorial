package com.arfilho.thymeleaf.controller;

import com.arfilho.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    // handler method to handle variable-expression request
    // http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Airton","airton@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "variable-expression";
    }

    // handler method to handle selection expressions
    // http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Airton","airton@gmail.com", "ADMIN", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handler method to handle message expressions request
    // http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    // handler method to handle link expressions
    // http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // handler method to handle fragment expressions
    // http://localhost:8080/fragment-expression
    @GetMapping("fragment-expression")
    public String fragmentExpression() {
        return "fragment-expression";
    }

    // http://localhost:8080/users
    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User airton = new User("Airton","airton@gmail.com", "USER", "Male");
        User ramesh = new User("Ramesh","ramesh@gmail.com", "USER", "Male");
        User meena = new User("Meena","meena@gmail.com", "USER", "Female");
        List<User> users = Arrays.asList(admin, airton, ramesh, meena);
        model.addAttribute("users", users);
        return "users";
    }

    // http://localhost:8080/if-unless
    @GetMapping("if-unless")
    public String ifUnless(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User airton = new User("Airton","airton@gmail.com", "USER", "Male");
        User ramesh = new User("Ramesh","ramesh@gmail.com", "USER", "Male");
        User meena = new User("Meena","meena@gmail.com", "USER", "Female");
        List<User> users = Arrays.asList(admin, airton, ramesh, meena);
        model.addAttribute("users", users);
        return "if-unless";
    }
}
