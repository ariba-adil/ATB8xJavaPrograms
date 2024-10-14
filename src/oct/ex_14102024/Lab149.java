package oct.ex_14102024;

public class Lab149 {

}

interface I3 {
    //default method is the only method that have body a body in interface
    default void start() {
        System.out.println("Body! DM");
    }

    void stop();
    void car();

    static void ss() {
        System.out.println("static can also have body in interface");
    }
}

abstract class AA {
    void f1() {
        System.out.println("Concrete method");
    }

    abstract void f2();

    static void f4() {
        System.out.println("Yes");
    }
}
