package sept.ex_27092024;

//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

public class Task3_WhileLoop_SumOfNumbers {
    public static void main(String [] args) {
        int n = 1;
        int sum = 0;
        while(n<=100)  {
            //System.out.println(sum=sum+n);
            sum = sum +n;
            n++;
        }
        System.out.println("Sum of the numbers from   1 to 100 is " + sum);
    }
}
