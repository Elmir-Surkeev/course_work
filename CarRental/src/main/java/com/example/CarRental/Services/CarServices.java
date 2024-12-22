package com.example.CarRental.Services;

import com.example.CarRental.Models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServices {
    private List<Car> cars = new ArrayList<Car>();
    private static long ID = 0;
    {
        cars.add(new Car(++ID, "Honda Fit", "Компактный автомобиль среднего класса.", 20000, 5.8, "Hatchback"));
        cars.add(new Car(++ID, "Toyota Corolla", "Надежный седан для семьи.", 25000, 6.5, "Sedan"));
    }
    public List<Car>  list() {return cars;}
    public Car getCarByID(long ID) {
        for (Car car : cars) {
            if (car.getID() == ID) {return car;}
        }
        return null;
    }

    public void saveCar(Car car) {
        car.setID(++ID);
        cars.add(car);
    }

    public void deleteCar(long ID) {
        cars.removeIf(car -> car.getID() == ID);
    }
}
