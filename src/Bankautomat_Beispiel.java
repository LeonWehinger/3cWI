import java.util.Scanner;

public class Bankautomat_Beispiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean weiter = true;
        int kontostand = 0;

        while (weiter){
            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand");
            System.out.println("4 Beenden");

            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Wie viel Geld möchten Sie einzahlen?");

                if (scanner.hasNextInt()) {
                    int einzahlen = scanner.nextInt ();
                    if (einzahlen > 0){
                        kontostand = kontostand + einzahlen;
                    }
                    else{
                        System.out.println("Keine positive Zahl");
                    }
                } else {
                    System.out.println("Die Eingabe ist ungültig");
                    scanner.next(); // Clear the invalid input
                }
            }

            else if (auswahl == 2) {
                System.out.println("Wie viel Geld möchten Sie abheben?");

                if (scanner.hasNextInt()) {
                    int abheben = scanner.nextInt();
                    if (abheben > 0){
                        kontostand = kontostand - abheben;
                    }
                    else{
                        System.out.println("Keine positive Zahl");
                    }
                } else {
                    System.out.println("Die Eingabe ist ungültig");
                    scanner.next(); // Clear the invalid input
                }
            }

            else if (auswahl == 3) {
                System.out.println("Ihr Kontostand: "+kontostand);

            }

            else if (auswahl == 4) {
                System.out.println("Beendet!");
                weiter = false;
            }

        }
    }
}
