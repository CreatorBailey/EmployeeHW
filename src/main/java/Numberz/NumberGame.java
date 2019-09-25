package Numberz;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberGame {
    public static void main(String[] args) {


        int number = 6;
        boolean flag = true;
     //   int counter = 0;
        Set<Integer>counter2= new HashSet<Integer>();


        Scanner scanner = new Scanner(System.in);

        while(flag){
            System.out.println("Guess?");
            int userInput = scanner.nextInt();


            if (userInput <number) {
                System.out.println("Too Small");
                counter2.add(userInput);
            }
            else if (userInput > number) {
                System.out.println("Too Big");
                counter2.add(userInput);

            }
            else if (userInput == number){
                System.out.println("Your MotherFuckin Right");
                break;
            }
         //   counter++;

           
            
        }


        System.out.println("You Tried" + " " + counter2.size() + " " + "Times");


    }
}
