package bg.technologies.adventure.web;

import bg.technologies.adventure.models.dto.UserLoginDTO;
import bg.technologies.adventure.models.dto.UserRegisterDTO;
import bg.technologies.adventure.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UsersController {
    private final UserService userService;

    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @PostMapping("/login")
    public ModelAndView login(UserLoginDTO userLoginDTO) {
        boolean isLogged = userService.login(userLoginDTO);

        if (isLogged) {
            return new ModelAndView("redirect:/");
        }

        return new ModelAndView("login");
    }

    @GetMapping("register")
    public ModelAndView register() {
        return new ModelAndView("register");
    }

    @PostMapping("register")
    public ModelAndView register(UserRegisterDTO userRegisterDTO) {
        this.userService.register(userRegisterDTO);

        return new ModelAndView("redirect:login");
    }

}