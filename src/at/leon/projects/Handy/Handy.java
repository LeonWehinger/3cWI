package at.leon.projects.Handy;

public class Handy {
    private String color;
    private SimKarte simKarte;
    private Speicherkarte speicherkarte;
    private Kamera kamera;

    public Handy(String color, SimKarte simKarte, Speicherkarte speicherkarte, Kamera kamera){
        this.color = color;
        this.simKarte = simKarte;
        this.speicherkarte = speicherkarte;
        this.kamera = kamera;
    }
}
