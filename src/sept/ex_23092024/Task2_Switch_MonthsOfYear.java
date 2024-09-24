package sept.ex_23092024;

import java.util.Scanner;
 // -> eliminates the need to write break statement
// -> this is used in versions above JDK 13
// WE CAN EVEN USE MULTIPLE MATCHES in versions above JDK 13 like below
// case 001,002,003:
//      S.O.P("");
//      break;

//OR
// case 001,002,003 -> S.O.P("");
public class Task2_Switch_MonthsOfYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int month = sc.nextInt();

        switch(month) {
            case 1 -> System.out.println("Month is January");
            case 2 -> System.out.println("Month is February");
            case 3 -> System.out.println("Month is March");
            case 4 -> System.out.println("Month is April");
            case 5 -> System.out.println("Month is May");
            case 6 -> System.out.println("Month is June");
            case 7 -> System.out.println("Month is July");
            case 8 -> System.out.println("Month is August");
            case 9 -> System.out.println("Month is September");
            case 10 -> System.out.println("Month is October");
            case 11 -> System.out.println("Month is November");
            case 12 -> System.out.println("Month is December");
            default -> System.out.println("Don't know which month");

        }
    }
}
