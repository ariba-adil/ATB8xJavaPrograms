package sept.ex_13092024;

public class Lab021_System_out_printf {
    public static void main(String[] args) {
        // Problem statement - print the table of 2
        // Formatting

        // %d - any integer, byte, short, long
        // %s - String
        // %c - char
        // %f -> float, double
        int num = 2;
        System.out.printf("Value of %d",num);
        System.out.println("2*1=2");
        System.out.printf("%d * %d = %d",num,1,num*1);
        System.out.printf("%d * %d = %d",num,2,num*2);
    }
}
