package sept.ex_30092024;

public class Lab122 {
    //main function is of type - //With Parameters, Without Return Type
    public static void main (String [] args) {
        function_type1();
        String name = function_type2();
        System.out.println(name);

        function_type3(12, "Amit", "mr");

        int res = function_type4(3, 4);
        System.out.println(res);
    }

        //Without Parameters, Without Return Type
        public static void function_type1() {
            System.out.println("Without Parameters, Without Return Type");
        }

        //Without Parameters, With Return Type
        public static String function_type2() {
            System.out.println("Without Parameters, With Return Type");
            return "Pramod";
        }

        //With Parameters, Without Return Type
        public static void function_type3(int age, String name, String firstname) {
            System.out.println("With Parameters, Without Return Type");
            System.out.println("You have shared -> " + name);
        }

        //With Parameters, With Return Type
        static int function_type4(int a, int b) {
            System.out.println("With Parameters, With Return Type");
            return a+b;
        }
    }

