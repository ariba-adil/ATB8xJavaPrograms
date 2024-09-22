package sept.ex_20092024;

//Write a program that prints numbers from 1 to 100.
// However, for multiples of 3, print "Fizz" instead of the number,
// and for multiples of 5, print "Buzz."
// For numbers that are multiples of both 3 and 5, print "FizzBuzz."

import java.util.Scanner;

public class Task4_FizzBuzz_IfElse {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        //System.out.println("Enter any number between 1 to 100");
        //int n = s.nextInt();

        for(int i = 1; i <=100; i++) {
            if(i%3==0) {
                System.out.println("Fizz");
            }
            if(i%5==0) {
                System.out.println("Buzz");
            }
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            }
        }
    }
}
