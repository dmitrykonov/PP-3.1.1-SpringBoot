package ru.dmitryk.kataprojects.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.dmitryk.kataprojects.web.model.User;
import ru.dmitryk.kataprojects.web.service.UserService;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UsersController {

    private UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users/index";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "users/show";
    }

    @GetMapping("/new")
    public String createUserForm(User user) {
        return "users/new";
    }

    @PostMapping
    public String addUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "users/new";
        }

        userService.addUser(user);
        return "redirect:/users";
    }

    @GetMapping("/{id}/edit")
    public String updateUserForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));

        return "users/edit";
    }

    @PostMapping("/{id}/edit")
    public String updateUser(@Valid User user, BindingResult bindingResult, @PathVariable("id") int id) {
        if (bindingResult.hasErrors()) {
            return "users/edit";
        }

        userService.addUser(user);
        return "redirect:/users";
    }

//    @PostMapping("/{id}/edit")
//    public String updateUser(@Valid User user, BindingResult bindingResult, @PathVariable("id") int id) {
//        if (bindingResult.hasErrors()) {
//            return "users/edit";
//        }
//
//        userService.addUser(user);
//        return "redirect:/users";
//    }

    @GetMapping("/delete-user/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
