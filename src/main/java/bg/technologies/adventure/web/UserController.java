package bg.technologies.adventure.web;


import bg.technologies.adventure.models.User;
import bg.technologies.adventure.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/users/all")
    public List<User> getAllUsers() {
        return this.userService.getAll();
    }
}

