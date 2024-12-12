package at.leon.projects.OOP;


public class Engine {
    public enum TYPE {DIESEL, GAS}

    ;
    private int horsePower;
    private TYPE type;

    public Engine(TYPE type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public void drive(int amount) {
        System.out.println("The motor is running with " + amount);
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }
}

