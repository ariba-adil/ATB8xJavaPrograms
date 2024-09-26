package sept.ex_25092024;

import java.util.Scanner;

public class Lab114_ScannerClass {
    public static void main(String[] args) {
        // How to take a use input
        //
        Scanner sc = new Scanner(System.in); // New Object
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(num);

//        System.out.println("Enter the String");
//        String name = sc.next();
//        System.out.println(name);

        System.out.println("Enter the String");
        String name1 = sc.nextLine();
        System.out.println(name1);

//        System.out.println("Enter the character");
//        char [] c = sc.next().toCharArray();
//        System.out.println(c);






    }
}
