package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServicelmp implements CarService {
    private List<Car> cars = List.of(
            new Car("BMW", 2, 1),
            new Car("Lexus", 20, 2),
            new Car("Volga", 4, 3),
            new Car("Lada", 65, 4),
            new Car("Mercedes", 10, 5)
    );

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getCars(int countCar) {
        if (countCar > cars.size()) {
            countCar = cars.size();
        }
        List<Car> carsReturn = new ArrayList<>();
        for (int i = 0; i < countCar; i++) {
            carsReturn.add(cars.get(i));
        }
        return carsReturn;
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
