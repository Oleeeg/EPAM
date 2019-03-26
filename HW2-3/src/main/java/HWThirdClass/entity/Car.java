package HWThirdClass.entity;

public class Car {
    private final Long carId;
    private final String brand;
    private final String model;
    private final Integer yearOfProduction;
    private String color;
    private Integer price;
    private String regNumber;

    public Car(Long carId, String brand, String model, Integer yearOfProduction, String color, Integer price,
               String regNumber) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public Car(Long carId, String brand, String model, Integer yearOfProduction, String regNumber) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.regNumber = regNumber;
    }

    public Car(Long carId, String brand, String model, Integer yearOfProduction) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public Long getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNumber='" + regNumber + '\'' +
                '}';
    }
}