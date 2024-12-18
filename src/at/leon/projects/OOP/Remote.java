package at.leon.projects.OOP;

import java.util.List;

public class Remote {
    private List<Battery>battery;
    private String color;

    public Remote(List<Battery> battery, String color) {
        this.battery = battery;
        this.color = color;
    }





    public List<Battery> getBattery() {
        return battery;
    }

    public void setBattery(List<Battery> battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
