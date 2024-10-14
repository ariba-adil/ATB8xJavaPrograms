package oct.ex_04102024;

public class AHuman { ;
    String eyes_color;
    String planet = "AHuman";
    String name;
    long aadhar_card_number;

    //default constructor
    AHuman(){
        System.out.println("I will be called, Object is created");
        //write code here which will execute automatically when object is created
        //code to read a file
        //read csv, excel file
    }

    //parametrized constructor
    AHuman(String name) {
        System.out.println("I am parametrised constructor");
        this.name = name;
    }

    void walk() {
      System.out.println("No Argument No Return Type");
    }

    int talk() {
        System.out.println("Return Type No Argument");
        return 10;
    }

    String sleep(String name) {
        System.out.println("Sleeping");
        System.out.println("Return Type With Argument");
        return "I am sleeping";
    }

    void eat(String name) {
        System.out.println("Eat");
        System.out.println("No Return Type With Argument");
    }
}
