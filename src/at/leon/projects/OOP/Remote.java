package at.leon.projects.OOP;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery>batteryList = new ArrayList<Battery>();
    private String color;

    public Remote( String color) {
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

    public List<Battery> addBattery(Battery battery){
        batteryList.add(battery);
        return null;
    }

}