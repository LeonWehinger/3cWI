package at.leon.projects.OOP_Lamp;

public class LightElement {
    public boolean StatusOn = false;
    private String name;
    private String color;
    private int powerConsumption;

    public LightElement(String name, String color, int powerConsumption) {
        this.name = name;
        this.color = color;
        this.powerConsumption = powerConsumption;
    }


    public void turnOn(){
        this.powerConsumption += 5;
        if (this.StatusOn){
            System.out.println("Mein Name ist '"+this.name+"'. Ich bin bereits eingeschaltet");
        }
        else {
            this.StatusOn = true;
            System.out.println("On");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
