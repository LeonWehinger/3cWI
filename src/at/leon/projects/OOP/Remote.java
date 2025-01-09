package at.leon.projects.OOP;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteryList = new ArrayList<>();
    private String color;


    public Remote(List<Battery> batteryList, String color) {
        this.batteryList = batteryList;
        this.color = color;
    }


    public void turnOn(List<Battery> batteries) {
        for (Battery battery : batteries) {
            battery.setChargingStatus(battery.getChargingStatus() - 5);
            System.out.println(battery.getChargingStatus());
            System.out.println("Verbraucher angeschlossen");
        }
    }

    public void turnOff(List<Battery> batteries) {
        for (Battery battery : batteries) {
            System.out.println("Kein Verbraucher angeschlossen");
        }
    }

    public Remote(String color) {
        this.color = color;
    }

    public List<Battery> getBatteryList() {
        return batteryList;
    }

    public void setBattery(List<Battery> battery) {
        this.batteryList = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Battery> addBattery(Battery battery) {
        batteryList.add(battery);
        return null;
    }

}
