package sept.ex_13092024;

public class Lab024_Literals_2 {
    public static void main(String[] args) {
        // Literals
        //Boolean
        // Integral

        // Char
        //Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = ' ';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Pramod"+ new_line + "Dutta");
        System.out.println("Pramod"+ tab_line + "Dutta");
        System.out.println("Pramod"+ back_space + "Dutta");
        System.out.println("Pramod"+ car_r + "Dutta");

        char c11 = 'A'; //ASCII
        // chinese - india, japanese -> unicode
        // /u09878

        System.out.println(c11);

    }
}
