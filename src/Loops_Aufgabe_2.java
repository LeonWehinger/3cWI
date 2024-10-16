public class Loops_Aufgabe_2 {
    public static void main(String[] args) {

        int i = 2;
        int P = 0;
        for (i = 2; i <= 1000; i = i + 2) {
            P += i;
        }

        System.out.println(P);
    }
}
