package Part1;
//Java program to demonstrate relational operators

import java.util.Scanner;

public class part1_relational_operators {
    public static void main(String[] args) {

        //create a new scanner
        Scanner in = new Scanner(System.in);

        //ask user to input 2 numbers
        System.out.println("Input 2 numbers");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();

        //compare them
        if(num1 == num2){
            System.out.println("Numbers are equal");
        } else{
            if (num1 > num2){
                System.out.println("First number is bigger than second");
            }
            else{
                System.out.println("Second number is bigger than First");
            }
        }

        //ask user to input 2 more numbers
        System.out.println("Input 2 more numbers");
        double num3 = in.nextDouble();
        double num4 = in.nextDouble();

        //compare them
        /*I did it in very strange way
          to show that I can use all
          relational operators
         */
        if(num3 != num4 && num3 >= num4){
            System.out.println("First number is bigger than second");
        } else{
            if (num3 != num4 && num3 <= num4){
                System.out.println("Second number is bigger than First");
            }
            else{
                System.out.println("Numbers are equal");
            }
        }




    }
}
