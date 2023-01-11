package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car(1, "Mercedes", "White"),
            new Car(2, "BMW", "Black"),
            new Car(3, "Audi", "Grey"),
            new Car(4, "Lada", "Red"),
            new Car(5, "KIA", "White"));

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
