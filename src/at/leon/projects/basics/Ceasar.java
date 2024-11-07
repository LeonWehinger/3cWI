package at.leon.projects.basics;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Ceasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String eingeben!");
        String Text = scanner.nextLine();
        System.out.println("Shift eingeben!");
        int Shift = scanner.nextInt();
        String encr = encrypt(Text, Shift);
        System.out.println(encr);
        String decr = decrypt(encr, Shift);
        System.out.println(decr);

    }

    public static String encrypt(String data, int Shift) {
        String encr = "";
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            encr = encr + (char) (ch + Shift);
        }


        return encr;
    }

    public static String decrypt(String data, int Shift) {
        String decr = "";
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            decr = decr + (char) (ch - Shift);
        }
        return decr;
    }
}
