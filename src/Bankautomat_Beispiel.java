import javax.xml.transform.Source;
import java.util.Scanner;

public class Bankautomat_Beispiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean weiter = true;

        while (weiter){
            System.out.println("1 Einzahlen");
            System.out.println("2 Abheben");
            System.out.println("3 Kontostand");
            System.out.println("4 Beenden");

            int auswahl = scanner.nextInt();

            if (auswahl == 1){
                System.out.println("Wie viel wollen Sie einzahlen?");
                double einzahlen = scanner.nextDouble();
                if (einzahlen >= 0 ) {
                    System.out.println("Sie haben " + einzahlen + "€ eingezahlt.");
                }
                else {
                    System.out.println("Fehler!");
                }

            }





        }
    }
}
