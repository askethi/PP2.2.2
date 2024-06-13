package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private final CarServiceImpl cs;

    @Autowired
    CarController(CarServiceImpl cs) {
        this.cs = cs;
    }
    @GetMapping("/cars")
    public String index(@RequestParam int count, ModelMap model) {
        model.addAttribute("cars", cs.takeNCars(count));
        return "cars";
    }
}
