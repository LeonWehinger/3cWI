package at.leon.projects.Handy;
import java.util.Scanner;

public class Kamera {
    private int resolution;
    Scanner scanner = new Scanner(System.in);




    public Kamera(int resolution) {
        this.resolution = resolution;
    }


    public void makePicture(Speicherkarte speicherkarte){
        System.out.println("wie viel GB:");
        int size = scanner.nextInt();
        System.out.println("Name:");
        String name = scanner.next();
        PhoneFile phoneFile = new PhoneFile(size,name);
        speicherkarte.freeSpace = speicherkarte.freeSpace - size;
        if (speicherkarte.freeSpace <= 0){
            System.out.println("Zu wenig Speicherplatz!");
        }
        else {
            speicherkarte.addFile(phoneFile);
        }


    }
}
