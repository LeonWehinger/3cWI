package at.leon.projects.Handy;

public class SimKarte {

    private final int id;
    private final int number;


    public SimKarte(int id, int number) {
        this.id = id;
        this.number = number;
    }

    public void Sim(){
        System.out.println("id = " +getId()+", number = "+getNumber());
    }

    public String Call(){
        return "I am calling!";
    }


    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }
}
