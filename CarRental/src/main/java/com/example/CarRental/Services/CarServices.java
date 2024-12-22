package com.example.CarRental.Services;

import com.example.CarRental.Models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServices {
    private List<Car> cars = new ArrayList<>();
    private static long ID = 0;

    // Статический блок инициализации для добавления автомобилей
    {
        cars.add(new Car(++ID, "Honda Fit", "Компактный автомобиль среднего класса.", 20000, 5.8, "Hatchback"));
        cars.add(new Car(++ID, "Toyota Corolla", "Надежный седан для семьи.", 25000, 6.5, "Sedan"));
    }

    // Метод для получения списка автомобилей
    public List<Car> list() {
        return cars;
    }

    // Метод для получения автомобиля по ID
    public Car getCarByID(long ID) {
        for (Car car : cars) {
            if (car.getID() == ID) {
                return car;
            }
        }
        return null;
    }

    // Метод для добавления нового автомобиля
    public void saveCar(Car car) {
        car.setID(++ID);
        cars.add(car);
    }

    // Метод для удаления автомобиля по ID
    public void deleteCar(long ID) {
        cars.removeIf(car -> car.getID() == ID);
    }
}
