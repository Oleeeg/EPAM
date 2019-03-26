package HWThirdClass;

import HWThirdClass.entity.Car;
import HWThirdClass.repository.RepositoryCar;
import HWThirdClass.service.CarService;
import HWThirdClass.ui.ConsoleUi;
import java.util.ArrayList;

public class ConsoleApplication {
    public static void main(String[] args) {
        Car car1 = new Car(1001L, "ferrari", "599", 2010, "Red", 20000000, "RegNmb220");
        Car car2 = new Car(1002L, "ferrari", "Enzo", 2002, "Red", 29000000, "RegNmb287");
        Car car3 = new Car(1003L, "maserati", "Levante", 2017, "White", 25500000, "RegNmb254");
        Car car4 = new Car(1004L, "maserati", "Ghibli", 2013, "Black", 8800000, "RegNmb222");
        Car car5 = new Car(1005L, "bugatti", "Chiron", 2017, "Blue", 900000, "RegNmb275");
        Car car6 = new Car(1006L, "bugatti", "Veyron grand sport", 2011, "Red", 654300000, "RegNmb292");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        RepositoryCar repositoryCar = new RepositoryCar(cars);
        CarService carService = new CarService(repositoryCar);

        ConsoleUi consoleUi = new ConsoleUi(carService);
        consoleUi.run();
    }
}
