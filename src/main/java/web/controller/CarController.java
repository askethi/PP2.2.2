package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    CarService cs = new CarService();

    @GetMapping("/cars")
    public String index(@RequestParam(defaultValue="5") int count, ModelMap model) {
        model.addAttribute("cars", cs.takeNCars(count));
        return "cars";
    }
}
