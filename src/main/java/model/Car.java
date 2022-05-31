package model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private int enginePower;

    public static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Lada", "Kalina", 83));
        carList.add(new Car("Lada", "Vesta", 106));
        carList.add(new Car("Hyundai", "Solaris", 123));
        carList.add(new Car("Toyota", "Corolla", 251));
        carList.add(new Car("Honda", "Civic", 186));
    }

    public Car(String brand, String model, int enginePower) {
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
    }

    public static List<Car> getCarList() {
        return carList;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEnginePower() {
        return enginePower;
    }
}
