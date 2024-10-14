package sept.ex_27092024;

import java.util.Scanner;

public class Task2_DoWhileLoop_First5EvenNos {
    public static void main(String[] args) {
        // Print first  5 even numbers using do--while loop program

        //method1
        int count = 0;
        int number = 2;
        while(count<5) {
            if(number%2==0) {
                System.out.println(number);
                count++;
            }
            number++;

        //method2
        int count1 = 0;
        int number1 = 0;
        do {
            System.out.println(number);
            number1 = number1 + 2;
            count1++;
        }
        while (count1 < 5);
    }

}
}