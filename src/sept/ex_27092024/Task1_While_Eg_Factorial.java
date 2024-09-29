package sept.ex_27092024;

public class Task1_While_Eg_Factorial {
    public static void main(String[] args) {

        // 5 = 5*4*3*2*1 = 120

        int fact =1;
        int i=1;

        while(i<=5)
        {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial of 5 is: " + fact);
    }

}
