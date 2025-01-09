package at.leon.projects.OOP;


public class Engine {
    public enum TYPE {DIESEL, GAS}


    private int horsePower;
    private TYPE type;

    public Engine(TYPE type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public void drive(int amount) {
        if (amount >= 1 && amount <= 100) {
            System.out.println("You are driving at " + amount * 2.5 + " km/h");
        } else {
            System.out.println("Please select a number between 1 and 100!");
        }
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

