package at.leon.projects.Handy;

public class HandyMain {
    public static void main(String[] args) {

 Kamera k1 = new Kamera(4000);
 SimKarte s1 = new SimKarte(1234, 065012345);
 Speicherkarte sp1 = new Speicherkarte(100);
 Handy h1 = new Handy("black", s1,sp1,k1);

 h1.getKamera().makePicture(h1.getSpeicherkarte());
 h1.getSpeicherkarte().getFiles(h1.getSpeicherkarte());






    }
}
