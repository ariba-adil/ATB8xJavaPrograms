package oct.ex_11102024.superKeyword;

import jdk.jshell.MethodSnippet;

public class Lab139 {
//    super keyword in java is a reference variable that allows
//    a sub class (child class to reference the parent class)
//    1. use of Super with Variables
//    2. use of Super with MethodS
//    3. use of super with Constructors

    public static void main(String [] args) {
        Car c = new Car();

    }
}


class Car extends Vehicle {
    private int maxSpeed = 281;

    void display() {
        System.out.println("Child");
    }

    Car() {
        super(10); //Constructor Chaining
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        this.display();
        super.display();
    }
}

class Vehicle {
    public int maxSpeed = 180;

    void display() {
        System.out.println("Parent");
    }

    Vehicle() {
       System.out.println("DC Vehicle");
    }

    Vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }
}
