package sept.ex_20092024;

// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->

import java.util.Scanner;

public class Task3_TriangleClassifier_IfElse {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side 1");
        int s1=sc.nextInt();
        System.out.println("Enter Side 2");
        int s2=sc.nextInt();
        System.out.println("Enter Side 3");
        int s3= sc.nextInt();

        if((s1==s2) && (s2==s3) && (s3==s1)) {
            System.out.println("Triangle is equilateral 'all sides are equal'");
        } else if ((s1!=s2) && (s2!=s3) && (s3!=s1)) {
            System.out.println("Triangle is scalene 'no sides are equal'");
        }
        else {
            System.out.println("Triangle is isosceles 'exactly two sides are equal'");
        }

    }
}
