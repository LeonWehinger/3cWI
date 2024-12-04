package at.leon.projects.OOP;

public class main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "Porsche";
        car1.fuelConsumption = 8;
        car1.fuelAmount = 160;
        car1.maxFuelAmount = 160;
        car1.serialNumber = "P1234";
        car1.color = "black";

        Car car2 = new Car();
        car2.brand = "VW";
        car2.fuelConsumption = 5;
        car2.fuelAmount = 120;
        car2.maxFuelAmount = 120;
        car2.serialNumber = "V1235";
        car2.color = "yellow";


        System.out.println(car2.fuelAmount);
        car2.getRemainingRange();
        car2.drive();
        car2.getRemainingRange();
        System.out.println(car2.fuelAmount);
        car2.turboBoost();
        car2.dobreak();
        car2.honk(1);


    }

}
