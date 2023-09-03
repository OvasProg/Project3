//Java program that asks user's details and recommend him a book

import java.util.Scanner;

public class part3 {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("This program will recommend you a book based on your interests");
        System.out.println("How old are you?");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("Choose your favourite genre from the following:");
        System.out.println("\t * detective");
        System.out.println("\t * dystopia");
        String genre = in.nextLine();

        System.out.print("I recommend you to read :");

        if (age < 6) {
            System.out.println("Doctor Powderpill (Aibolit)");
        } else if (age <= 13) {
            System.out.println("Fedko-brigand");
        } else if (age <= 15 && genre.equals("detective")) {
            System.out.println("Mr Mercedes");
        } else if (age <= 15 && genre.equals("dystopia")) {
            System.out.println("Metro");
        } else if (age <= 18 && genre.equals("detective")) {
            System.out.println("Murder on the Orient Express");
        } else if (age <= 18 && genre.equals("dystopia")) {
            System.out.println("Animal farm");
        } else {
            System.out.println("Sorry, I'm too young to recommend you something");
        }
    }
}