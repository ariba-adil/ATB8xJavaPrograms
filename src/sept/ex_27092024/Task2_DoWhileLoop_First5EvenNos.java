package sept.ex_27092024;

import java.util.Scanner;

public class Task2_DoWhileLoop_First5EvenNos {
    public static void main(String [] args) {
        // Print first  5 even numbers using do--while loop program

        int i=2,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        n=sc.nextInt();

        do
        {
            if (i%2==0){
                System.out.println(i);
            }
            i++;

        }while(i<=n);
    }
    }

