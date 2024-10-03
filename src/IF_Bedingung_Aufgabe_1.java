import java.util.Random;

public class IF_Bedingung_Aufgabe_1 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        if (randomNumber < 20){
            System.out.println("Mini");
            }
        else if (randomNumber < 50 && randomNumber > 19){
            System.out.println("Medium");
        }
        else {
            System.out.println("Large");
        }




    }
}
