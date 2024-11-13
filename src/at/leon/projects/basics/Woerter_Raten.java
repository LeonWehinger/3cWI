package at.leon.projects.basics;

import java.util.Scanner;

public class Woerter_Raten {
    public static void main(String[] args) {
        String Word = "Crazy";
        char[] wordarray = Word.toCharArray();
        char[] hiddenarray = new char[wordarray.length];

        System.out.println(hiddenarray);
        for (int i = 0; i < hiddenarray.length; i++) {
            hiddenarray[i] = '*';
        }

        Scanner scanner = new Scanner(System.in);

        boolean finished = false;
        while (!finished) {
            System.out.println(hiddenarray);
            System.out.println("Gib einen Buchstaben ein!");
            String input = scanner.nextLine();
            char guess = input.charAt(0);
            for (int i = 0; i < wordarray.length; i++) {
                if (guess == wordarray[i]) {
                    hiddenarray[i] = guess;
                }
                if (hiddenarray == wordarray) {
                    System.out.println("Das Wort war:" + Word);
                    finished = true;
                }

            }
        }


    }


}

