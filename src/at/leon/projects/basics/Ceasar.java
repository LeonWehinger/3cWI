package at.leon.projects.basics;

import java.lang.reflect.Array;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Ceasar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib einen Text ein!");
        String Text = scanner.nextLine();
        String encrypted = encrypt(Text);
        System.out.println(encrypted);

    }

    public static String encrypt (String data) {
    String encrypted = "";
        for (int i = 0; i < data.length(); i++){
            char ch = data.charAt(i);
            encrypted = encrypted + (ch);
        }



        return "";
    }

    public static String decrypt (String data) {
        return "";
    }
}
