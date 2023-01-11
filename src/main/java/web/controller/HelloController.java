package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class HelloController {

    @GetMapping("/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping("/cars")
    public String printCars(Model model
            , @RequestParam(value = "count", required = false, defaultValue = "5") int count) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}