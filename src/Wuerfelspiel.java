import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean nejo = true;
        while (nejo) {
            int playerwuerfelsumme = 0;
            int pcwuerfelsumme = 0;

            for (int i = 0; i < 6; i++) {
                int playerwuerfeln = random.nextInt(6) + 1;
                int pcwuerfeln = random.nextInt(6) + 1;


                System.out.println("1 zum Wuerfeln");
                System.out.println("2 zum Beenden");
                int auswahl = scanner.nextInt();


                if (auswahl == 1) {
                    System.out.println("Du hast " + playerwuerfeln + " gewuerfelt");
                    playerwuerfelsumme += playerwuerfeln;
                    System.out.println("Deine Wuerfelsumme: " + playerwuerfelsumme);

                    System.out.println("Der Computer hat " + pcwuerfeln + " gewuerfelt");
                    pcwuerfelsumme += pcwuerfeln;
                    System.out.println("Seine Wuerfelsumme: " + pcwuerfelsumme);
                }
            }
            if (playerwuerfelsumme > pcwuerfelsumme) {
                System.out.println("Du hast gewonnen!");
            } else if (pcwuerfelsumme > playerwuerfelsumme) {
                System.out.println("Du hast verloren!");
            } else if (pcwuerfelsumme == playerwuerfelsumme) {
                System.out.println("Gleichstand!");
            } else {
                System.out.println("Fehler, Nejo schuld!");
            }
            System.out.println("");
            int auswahl2 = scanner.nextInt();

            nejo = false;

        }
    }
}

