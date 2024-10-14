package sept.ex_30092024;

import java.util.Scanner;

public class Task3_CountVowelsConsonants {
    public static void main(String [] args) {
        int vowelCount = 0;
        int consonantCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        for(int i = 0 ; i <s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                vowelCount = vowelCount+1;
            }
            else {
                consonantCount = consonantCount+1;
            }
        }
        System.out.println("Vowels are " + vowelCount);
        System.out.println("Consonants are " + consonantCount);


    }
}
