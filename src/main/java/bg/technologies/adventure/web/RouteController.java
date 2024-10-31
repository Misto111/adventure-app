package bg.technologies.adventure.web;

import bg.technologies.adventure.models.dto.AddRoteDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/routes")
public class RouteController {

    @GetMapping("/add")
    public ModelAndView addRoute() {
        return new ModelAndView("add-route");
    }

    @PostMapping("/add")
    public ModelAndView addRoute(AddRoteDTO addRoteDTO) {
        return new ModelAndView("add-route");
    }

}
