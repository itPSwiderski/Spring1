package pl.sda.spring1.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring1.model.Car;
import pl.sda.spring1.service.CarService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CarController {
    //Klasyczny sposób
    // private CarService carService = new CarService();

    /*    private  CarService carService;*/

    //Wstrzykiwanie poprzez Konstruktor
/*    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }*/

    //Wstrzykiwanie poprzez Setter


    //Wstrzykiwanie porpzesz pole/własciwość/adnotacje


    private final CarService carService;

    @GetMapping
    public List<Car> get() {
        return carService.getCars();

    }


}
