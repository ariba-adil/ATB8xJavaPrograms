package sept.ex_27092024;

public class Lab122_While_DoWhile {
    public static void main(String[] args) {
        //should not print bcz age is 17 but this is do while

        int age =17;
        do {
            System.out.println("Can Vote");
            age++;
        }while  (age<18);

        System.out.println("_______________");

        //while-Nothing will print bcz contion is not true
        int age1 =17;
        while(age>18){
            System.out.println("Can Vote");
            age1++;
        }


    }
}
