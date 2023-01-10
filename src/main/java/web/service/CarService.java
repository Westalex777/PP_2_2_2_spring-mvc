package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car(1, "Mercedes", "White"),
            new Car(2, "BMW", "Black"),
            new Car(3, "Audi", "Grey"),
            new Car(4, "Lada", "Red"),
            new Car(5, "KIA", "White"));

    public List<Car> getCars(Optional<Integer> count) {
        return cars.stream().limit(count.orElse(cars.size())).toList();
    }
}
