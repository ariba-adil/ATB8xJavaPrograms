package sept.ex_25092024;

public class Task1_Table_WhileLoop {
    public static void main(String[] args) {
        int num = 10;
            int i = 1;
        while(i<=num) {
            int res = num*i;
            System.out.println(num + " x " + i + " = " + res);
            i++;
        }

    }
}
