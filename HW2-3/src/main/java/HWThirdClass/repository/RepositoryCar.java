package HWThirdClass.repository;

import HWThirdClass.entity.Car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class RepositoryCar {

    private List<Car> cars;

    public RepositoryCar(List<Car> cars) {
        this.cars = cars;
    }

    public Car fingById(Long id) {
        for (Car car: cars) {
            if (car.getCarId().equals(id)) return car;
        }
        return null;
    }

    public List<Car> findCertainBrand(String brand) {
        List<Car> res = new ArrayList<>();
        for (Car car: cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                res.add(car);
            }
        }
        return res;
    }

    public List<Car> findByModelAndExploitation(String model, Integer years) {
        List<Car> res = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        for (Car car: cars) {
            if ((car.getModel().equalsIgnoreCase(model)) &&
                    (calendar.get(Calendar.YEAR)-car.getYearOfProduction()>years)) {
                res.add(car);
            }
        }
        return res;
    }

    public List<Car> findByYearAndPrice (Integer year, Integer price) {
        List<Car> res = new ArrayList<>();
        for (Car car: cars) {
            if ((car.getYearOfProduction().equals(year)) && (car.getPrice()>price)) {
                res.add(car);
            }
        }
        return res;
    }
}
