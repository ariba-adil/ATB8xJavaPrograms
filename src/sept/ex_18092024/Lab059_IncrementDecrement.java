package sept.ex_18092024;

public class Lab059_IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //A -> ++a -> Exp1 = 11, a=11
        //B -> a++ -> Exp2 = 11, a=12
        //C -> a++ -> Exp3 = 12, a=13

    }
}
