package at.leon.projects.OOP;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private int fuelConsumption;
    private int fuelAmount;
    private int maxFuelAmount;
    private String color;
    private String serialNumber;
    private boolean trailer_hitch;
    private Engine engine;
    private List<RearMirror> mirrors;
    private List<Tire> tires;


    public Car(List mirrors,List tires,String brand, int fuelConsumption, int fuelAmount, int maxFuelAmount, String serialNumber, String color, boolean trailer_hitch, Engine engine) {
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.maxFuelAmount = maxFuelAmount;
        this.serialNumber = serialNumber;
        this.color = color;
        this.trailer_hitch = trailer_hitch;
        this.engine = engine;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }


    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addTires(Tire tires) {
        this.tires.add(tires);
    }


    public void dobreak() {
        System.out.println("I am braking!");
    }

    public void drive() {
        System.out.println("I am driving!");
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


    //Getter & Setter


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

    public void setTrailer_hitch(boolean trailer_hitch) {
        this.trailer_hitch = trailer_hitch;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<RearMirror> mirrors) {
        this.mirrors = mirrors;
    }

    public boolean getTrailer_hitch() {

        if (trailer_hitch) {
            System.out.println("has a trailer hitch");
            return true;
        } else {
            System.out.println("has no trailer hitch");
            return false;

        }

    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }
}
