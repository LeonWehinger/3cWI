package at.leon.projects.basics;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean nejo = true;
        boolean valid = false;


        while (nejo) {
            int playerwuerfelsumme = 0;
            int pcwuerfelsumme = 0;

            for (int i = 0; i < 6; i++) {
                int playerwuerfeln = random.nextInt(6) + 1;
                int pcwuerfeln = random.nextInt(6) + 1;
                int auswahl = 0;


                System.out.println("1: Wuerfeln");
                System.out.println("2: Beenden");

                auswahl = scanner.nextInt();


                if (auswahl == 1) {
                    System.out.println("Du hast " + playerwuerfeln + " gewuerfelt");
                    playerwuerfelsumme += playerwuerfeln;
                    System.out.println("Der Computer hat " + pcwuerfeln + " gewuerfelt");
                    pcwuerfelsumme += pcwuerfeln;
                    System.out.println("Deine Wuerfelsumme: " + playerwuerfelsumme);
                    System.out.println("Seine Wuerfelsumme: " + pcwuerfelsumme);
                } else if (auswahl == 2) {
                    System.out.println("Spiel beendet!");
                    nejo = false;
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
            System.out.println("1: Nochmal spielen");
            System.out.println("2: Beenden");
            int auswahl2 = scanner.nextInt();
            if (auswahl2 == 2) {
                System.out.println("Spiel beendet");
                nejo = false;
            } else if (auswahl2 == 1) {
                System.out.println("Neues Spiel");
            }

        }
    }
}

