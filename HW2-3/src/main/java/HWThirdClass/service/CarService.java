package HWThirdClass.service;

import HWThirdClass.entity.Car;
import HWThirdClass.repository.RepositoryCar;

import java.util.List;

public class CarService {

    private RepositoryCar repositoryCar;

    public CarService(RepositoryCar repositoryCar) {
        this.repositoryCar = repositoryCar;
    }

    public Car fingById(Long id) {
        return repositoryCar.fingById(id);
    }

    public List<Car> findCertainBrand(String brand) {
        return repositoryCar.findCertainBrand(brand);
    }

    public List<Car> findByModelAndExploitation(String model, Integer years) {
        return repositoryCar.findByModelAndExploitation(model, years);
    }

    public List<Car> findByYearAndPrice(Integer year, Integer price) {
        return repositoryCar.findByYearAndPrice(year, price);
    }
}
