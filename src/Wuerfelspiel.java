import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean weiter = true;
        int auswahl = scanner.nextInt();
        int würfeln = random.nextInt(6) + 1;
        int würfelsumme = 0;

        while (weiter) {
            System.out.println("1 zum Würfeln");
            System.out.println("2 zum Beenden");

            if (auswahl == 1) {
                System.out.println(würfeln);
                würfelsumme += würfeln;
            }
        }
    }
}
