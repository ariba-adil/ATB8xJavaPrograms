package sept.ex_18092024;

public class Task2_Increment_Decrement_Operator {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(--a + a-- + a--);
        System.out.print(a);
        //a -> --a -> 10 ->
        //b -> a-- -> 10
        //c -> a-- -> 9
        //
    }
}
