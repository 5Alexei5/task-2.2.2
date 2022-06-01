package web.dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    @Override
    public List<Car> gerAllCars() {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Lada", "Kalina", 83));
        carList.add(new Car("Lada", "Vesta", 106));
        carList.add(new Car("Hyundai", "Solaris", 123));
        carList.add(new Car("Toyota", "Corolla", 251));
        carList.add(new Car("Honda", "Civic", 186));

        return carList;
    }
}
