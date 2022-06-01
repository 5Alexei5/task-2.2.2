package web.service;

import web.dao.CarDAO;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAO carDao;

    @Autowired
    public CarServiceImpl(CarDAO carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(long count) {
        List<Car> carList = carDao.gerAllCars();

        return carList.stream().limit(count).toList();
    }
}
