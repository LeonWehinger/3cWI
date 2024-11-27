package at.leon.projects.basics;

import java.util.Scanner;
public class Logarithmus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basis:");
        int N = scanner.nextInt();
        System.out.println("Ergebnis:");
        int Y = scanner.nextInt();

        double result = Math.log(Y) / Math.log(N);
        System.out.println("("+N+";"+Y+") = "+result);

    }
}
