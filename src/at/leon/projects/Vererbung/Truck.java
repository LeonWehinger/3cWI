package at.leon.projects.Vererbung;

import at.leon.projects.OOP.Car;
import at.leon.projects.OOP.Engine;

import java.util.List;

public class Truck extends Car {

    private String trailer;




    public Truck(List mirrors, List tires, String brand, int fuelConsumption, int fuelAmount, int maxFuelAmount, String serialNumber, String color, boolean trailer_hitch, Engine engine, String trailer) {
        super(mirrors, tires, brand, fuelConsumption, fuelAmount, maxFuelAmount, serialNumber, color, trailer_hitch, engine);
        this.trailer = trailer;
        if (!getTrailer_hitch() && this.trailer != "") {
            System.out.println("Darfst du nicht!");
        }
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
