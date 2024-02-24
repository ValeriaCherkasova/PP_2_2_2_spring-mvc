package web.service;
import org.junit.jupiter.api.Test;
import web.model.Car;

import java.lang.reflect.Array;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarServicelmpTest {

    @Test
    void getCars() {
        CarService carService = new CarServicelmp();
        List<Car> cars = carService.getCars(5);
        assertEquals(5, cars.size());
        System.out.println(cars);
    }
}
