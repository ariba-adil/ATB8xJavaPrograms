package sept.ex_30092024;

import java.util.Scanner;

//Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
//
//        // n = 1 ->  Fact = 1*1 -> 1
//
//        // n = 3 -> Fact = 3*2*1 -> 6

public class Task1_Factorial_UsingFunction {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");

        int n = s.nextInt();
        calFactorial(n);

    }

    public static void calFactorial(int num) {
        int fact = 1;
        for(int i =1; i<=num; i++) {
            fact = fact *num;
        }
        System.out.println(fact);
    }
}
