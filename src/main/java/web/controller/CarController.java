package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String getCarsList(@RequestParam long count, Model model) {

        List<Car> carList = Car.getCarList().stream().limit(count).toList();
        model.addAttribute("carList", carList);
        return "/cars";
    }
}
