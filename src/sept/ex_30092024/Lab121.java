package sept.ex_30092024;

public class Lab121 {
    public static void main(String[] args) {
        for ( int i = 0; i<100; i++){    // to call the the fn 100 times we can use for loop
            greet();   // repeat this line to get multiple times the output
        }
        // define
        // No return type no argument
        greet();
    }

    public static void greet() {
        System.out.println("Hi");
    }
}