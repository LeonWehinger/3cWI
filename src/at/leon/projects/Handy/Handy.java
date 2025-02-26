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

    public void changeSpeicherkarte(Speicherkarte speicherkarte){
        this.speicherkarte = speicherkarte;
        System.out.println("Speicherkarte ausgewechselt!");
    }

    public void changeKamera(Kamera kamera){
        this.kamera = kamera;
        System.out.println("Kamera ausgewechselt!");
    }
    public void changeSimKarte(SimKarte simKarte){
        this.simKarte = simKarte;
        System.out.println("Sim-Karte ausgewechselt!");
    }


    public String getColor() {
        return color;
    }

    public Speicherkarte getSpeicherkarte() {
        return speicherkarte;
    }

    public SimKarte getSimKarte() {
        return simKarte;
    }

    public Kamera getKamera() {
        return kamera;
    }
}
