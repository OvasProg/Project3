//Java program that asks user's age and suppose what kind of daily activity he has

import java.util.Scanner;

public class part2 {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        System.out.println("This program will tell what kind of daily activity you have");
        System.out.println("How old are you?");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("Your daily activity is:");

        if (age < 6) {
            System.out.println("Home, walk and kindergarten");
        } else if (age <= 17) {
            System.out.println("School");
        } else if (age <= 22) {
            System.out.println("University");
        } else if (age < 60) {
            System.out.println("Work");
        } else {
            System.out.println("Retired");
        }
    }
}