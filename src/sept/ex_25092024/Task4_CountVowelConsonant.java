package sept.ex_25092024;

import java.util.Scanner;

public class Task4_CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i = 0; i<s.length();i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowelCount = vowelCount+1;
            }
            else {
                consonantCount = consonantCount+1;
            }
        }
        System.out.println("Total vowels in string " + s + "= " + vowelCount);
        System.out.println("Total consonants in string " + s + "= " + consonantCount);
    }

}
