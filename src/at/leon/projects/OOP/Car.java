package at.leon.projects.OOP;

public class Car {
    private String brand;
    private int fuelConsumption;
    private int fuelAmount;
    private int maxFuelAmount;
    private String color;
    private String serialNumber;



    public Car(String brand, int fuelConsumption, int fuelAmount, int maxFuelAmount, String serialNumber, String color) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.maxFuelAmount = maxFuelAmount;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving!");
    }

    public void dobreak() {
        System.out.println("I am braking!");
    }

    public void turboBoost() {
        if (this.fuelAmount >= this.maxFuelAmount * 0.1) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.print("Tuuut ");
        }
    }

    public void getRemainingRange() {
        double RemainingRange = this.fuelAmount / this.fuelConsumption;
        System.out.println("The remaining range is: " + RemainingRange);
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getMaxFuelAmount() {
        return maxFuelAmount;
    }

    public void setMaxFuelAmount(int maxFuelAmount) {
        this.maxFuelAmount = maxFuelAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
