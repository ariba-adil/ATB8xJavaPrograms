package sept.ex_23092024;

import java.util.Scanner;

public class Task3_Switch_ConvertingUnits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice 1 or 2");
        int choice = sc.nextInt();
        System.out.println("Enter number in km to be converted in m");
        int num_km = sc.nextInt();
        System.out.println("Enter number in farenheit to be converted in celcius");
        int f = sc.nextInt();

        switch(choice) {
            case 1 :
                int res = num_km*1000;
                System.out.println(res + "m");
                break;
            case 2 :
                double res1 = ((f -32)*5/9);
                System.out.println(res1 + "C");
                break;
            default :
                System.out.println("not valid");
                break;
        }
    }
}
