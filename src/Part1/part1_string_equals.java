package Part1;
//Java program to compare strings using String.equals() inside if condition statement.

import java.util.Scanner;

public class part1_string_equals {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        String random_word = "communication";

        System.out.println("I chose a random english word");
        System.out.println("Try to guess it");
        System.out.println("You have 3 attemptі");
        String your_word = in.nextLine();

        if (your_word.equals(random_word)) {
            System.out.println("OMG!!! You guessed");
        } else {
            System.out.println("2 attempts left...");
            System.out.println("A small clue: c***********n");
            String your_word1 = in.nextLine();

            if (your_word1.equals(random_word)) {
                System.out.println("You guessed");
            } else {
                System.out.println("1 attempt left...");
                System.out.println("A bigger clue: c**m**i**t**n");
                String your_word2 = in.nextLine();

                if (your_word2.equals(random_word)) {
                    System.out.println("Exactly");
                } else {
                    System.out.println("You lost");
                    System.out.println("The word: communication");
                }
            }

        }
    }
}