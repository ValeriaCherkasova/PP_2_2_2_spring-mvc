package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> carsList = List.of(
            new Car("BMW", 2, 1),
            new Car("Lexus", 20, 2),
            new Car("Volga", 4, 3),
            new Car("Lada", 65, 4),
            new Car("Mercedes", 10, 5)
    );

    @Override
    public List<Car> getCars(int countCar) {
        if (countCar > carsList.size()) {
            countCar = carsList.size();
        }
        List<Car> carsReturn = new ArrayList<>();
        for (int i = 0; i < countCar; i++) {
            carsReturn.add(carsList.get(i));
        }
        return carsReturn;
    }

    @Override
    public List<Car> getAllCars() {
        return carsList;
    }
}
