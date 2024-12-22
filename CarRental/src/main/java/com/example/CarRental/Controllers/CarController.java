package com.example.CarRental.Controllers;

import com.example.CarRental.Models.Car;
import com.example.CarRental.Services.CarServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
// Контроллер контролирует обращение пользователя к приложению
public class CarController {
    private final CarServices carServices;

    public CarController(CarServices carServices) {
        this.carServices = carServices;
    }

    // При переходе на локальный хост будет вызываться
    @GetMapping("/")
    public String cars(Model model) {
        model.addAttribute("cars", carServices.list());
        return "cars";
    }

    @GetMapping("/car/{ID}")
    public String carDescription(@PathVariable long ID, Model model) {
        model.addAttribute("car", carServices.getCarByID(ID));
        return "car-description";
    }

    @PostMapping("/car/create")
    public String createCar(Car car) {
        carServices.saveCar(car);
        return "redirect:/";
    }

    @PostMapping("/car/delete/{ID}")
    public String deleteCar(@PathVariable long ID) {
        carServices.deleteCar(ID);
        return "redirect:/";
    }
}
