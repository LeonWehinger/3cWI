import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {



        boolean isfinished = true;
        int summe = 0;

        while (isfinished){

            Random random = new Random();
            int rndm = random.nextInt(21)+10;
            summe += rndm;
            System.out.println(rndm);

            if (rndm == 15 || rndm == 25){
                isfinished = false;
                System.out.println(summe);
            }
        }





    }
}
