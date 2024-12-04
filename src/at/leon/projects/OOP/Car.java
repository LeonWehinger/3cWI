package at.leon.projects.OOP;

public class Car {
    public String brand;
    public int fuelConsumption;
    public int fuelAmount;
    public int maxFuelAmount;
    public String serialNumber;
    public String color;


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


    //public Car(String brand, double fuelConsumption, double fuelAmount, String serialNumber, String color) {
    // this.brand = brand;
    // this.fuelConsumption = fuelConsumption;
    //  this.serialNumber = serialNumber;
    // this.color = color;
    //}
}
