package Part1;
//Java program to demonstrate using os switch structure

import java.util.Scanner;

public class part1_switch {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //ask user to choose ice cream
        System.out.println("Choose one ice cream from the following:");
        System.out.println("\t * Chocolate");
        System.out.println("\t * Strawberry");
        System.out.println("\t * Vanilla");
        System.out.println("\t * Caramel");
        System.out.println("Which ice cream would you like to order?");
        String ice_cream = in.nextLine();

        switch (ice_cream.toLowerCase()){
            case "chocolate":
                System.out.println("Would you like to add some strawberries?");
                break;
            case "strawberry":
                System.out.println("Would you like to add some chocolate?");
                break;
            case "vanilla":
                System.out.println("Would you like to add some strawberries?");
                break;
            case "caramel":
                System.out.println("Would you like to add some chocolate?");
                break;
        }
        String answer = in.nextLine();
        System.out.println("Making your ice cream...");
        System.out.println("This is your ice cream.");
        System.out.println("Thank you for choosing Wil Wright's Ice Cream Parlor");


    }
}
