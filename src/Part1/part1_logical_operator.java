package Part1;
//Java program to demonstrate logical operators
//Also it demonstrates nested if/else conditionals
//And also demonstrates using conditions with user input.
import java.util.Scanner;

public class part1_logical_operator {
    // Program tells if I should / shouldn't buy something
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //ask user some basic questions about it
        System.out.println("It's interesting? (true / false)");
        boolean ItIsInteresting = in.nextBoolean();
        System.out.println("It's cheap? (true / false)");
        boolean ItIsCheap = in.nextBoolean();
        System.out.println("It's beautiful? (true / false)");
        boolean ItIsBeautiful = in.nextBoolean();
        System.out.println("It's useful? (true / false)");
        boolean ItIsUseful = in.nextBoolean();

        if (ItIsCheap){
            if (ItIsUseful){
                System.out.println("I have to buy it");
            } else if(ItIsInteresting || ItIsBeautiful){
                System.out.println("I could buy it");
            } else{
                System.out.println("I shouldn't buy it");
            }

        }else if(ItIsUseful){
            System.out.println("I should buy it if I have enough money");
        }else{
            System.out.println("I shouldn't buy it");
        }
    }
}
