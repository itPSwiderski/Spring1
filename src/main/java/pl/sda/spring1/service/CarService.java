package pl.sda.spring1.service;

import lombok.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.sda.spring1.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> cars;

    public CarService() {
        Car car1 = new Car("bmw","e46");
        Car car2 = new Car("ford","mondeo");
        Car car3 = new Car("opel","astra");
        this.cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
    }

    public List<Car> getCars() {
        return cars;
    }
}
