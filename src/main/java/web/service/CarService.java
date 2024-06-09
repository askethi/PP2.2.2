package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    List<Car> cars = new ArrayList<>();

    private void fillList() {
        cars.add(new Car("Lada", 1, "Ivan"));
        cars.add(new Car("Moskovitz", 2, "Pyotr"));
        cars.add(new Car("Volga", 3, "Pavel"));
        cars.add(new Car("Tavria", 4, "Lev"));
        cars.add(new Car("Pobeda", 4, "Oleg"));
    }

    public List<Car> takeNCars (int n) {
        fillList();
        return cars.stream().limit(n).collect(Collectors.toList());
    }
}
