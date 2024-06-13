package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    CarServiceImpl() {
        cars.add(new Car("Lada", 1, "Ivan"));
        cars.add(new Car("Moskovitz", 2, "Pyotr"));
        cars.add(new Car("Volga", 3, "Pavel"));
        cars.add(new Car("Tavria", 4, "Lev"));
        cars.add(new Car("Pobeda", 4, "Oleg"));
    }

    @Override
    public List<Car> takeNCars (int n) {
        return cars.stream().limit(n).collect(Collectors.toList());
    }
}
