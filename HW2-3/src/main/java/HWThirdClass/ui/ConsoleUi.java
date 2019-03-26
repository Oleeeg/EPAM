package HWThirdClass.ui;

import HWThirdClass.entity.Car;
import HWThirdClass.service.CarService;

import java.util.List;
import java.util.Scanner;

public class ConsoleUi {

    private CarService carService;
    private Scanner scanner;

    public ConsoleUi(CarService carService) {
        this.carService = carService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("Enter the model : ");
        String model = scanner.nextLine();
        System.out.println("Enter years of exploitation : ");
        Integer exploitation = scanner.nextInt();
        List<Car> carsByMarkAndYears = carService.findByModelAndExploitation(model, exploitation);
        for (Car car: carsByMarkAndYears) {
            System.out.println(car);
        }

        System.out.println("Enter the year of production : ");
        Integer year = scanner.nextInt();
        System.out.println("Enter the price :");
        Integer price = scanner.nextInt();
        List<Car> carsByYearAndPrice = carService.findByYearAndPrice(year, price);
        for (Car car: carsByYearAndPrice) {
            System.out.println(car);
        }

        System.out.println("Enter the name of a brand : ");
        String brand = scanner.next();
        List<Car> carsByBrand = carService.findCertainBrand(brand);
        for (Car car: carsByBrand) {
            System.out.println(car);
        }
    }

}
