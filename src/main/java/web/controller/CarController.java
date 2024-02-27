package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping
    public String printCars(@RequestParam(name = "count", required = false) Integer locale, ModelMap model) {
        if (locale == null) {
            List<Car> cars = carService.getAllCars();
            model.addAttribute("cars", cars);
            return "cars";
        }
        List<Car> cars = carService.getCars(locale);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
