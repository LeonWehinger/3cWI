package at.leon.projects.Handy;

public class HandyMain {
    public static void main(String[] args) {

 Kamera k1 = new Kamera(4000);
 Kamera k2 = new Kamera(3000);
 SimKarte s1 = new SimKarte(1234, 65012345);
 SimKarte s2 = new SimKarte(2345, 68012345);
 Speicherkarte sp1 = new Speicherkarte(100);
 Speicherkarte sp2 = new Speicherkarte(100);
 Handy h1 = new Handy("black", s1,sp1,k1);

 h1.getKamera().makePicture(h1.getSpeicherkarte());
 h1.getSpeicherkarte().getFiles();
 h1.changeSpeicherkarte(sp2);
 h1.getSpeicherkarte().getFiles();
 h1.changeSpeicherkarte(sp1);
 h1.getSpeicherkarte().getFiles();
 h1.changeSimKarte(s2);
 h1.changeKamera(k2);








    }
}
