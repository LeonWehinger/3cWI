package at.leon.projects.basics;

import java.util.Scanner;

public class Woerter_Raten {
    public static void main(String[] args) {
        String Word = "Crazy";
        char[] wordarray = Word.toCharArray();
        char[] hiddenarray = new char[wordarray.length];

        System.out.println(hiddenarray);
        for (int i = 0; i < hiddenarray.length; i++){
            hiddenarray[i] = '*';
        }

        Scanner scanner = new Scanner(System.in);

        boolean finished = false;
        while (!finished){

        }


    }
}
