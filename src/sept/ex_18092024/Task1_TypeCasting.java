package sept.ex_18092024;

//Give some another example of Widening with Implicit and Explicit
//Narrowing with implicit and explicit

public class Task1_TypeCasting {
    public static void main(String[] args) {
        //1
        //widening with implicit

//        short s=500;
//        double y=70987;
//        System.out.println(s);
//        System.out.println(y);
//
//        //Widening with explicit
//        short s1=500;
//        double y1=(double)70987;
//        System.out.println(s1);
//        System.out.println(y1);

//        //narrowing with implicit
//        double num=98765432198.9087;
//        int b=num;
//        System.out.println(b);

//
//        //narrowing with explicit
//        int num1=(int)987654321;
//        System.out.println(num1);
//
//        //2
//        int a=10;
//        System.out.println(--a + a-- + a--);
//        System.out.println(a);
//
//        //3
//
//        int a=10;
//        System.out.println(--a + a++ + a--);
//        System.out.println(a);

//        //4
        int a=10;
        System.out.println(a-- + a--  + a--);
        System.out.println(a);


//        1).widening with implicit
//
//        short s=500;
//        double y=70987;
//        System.out.println(s);//500
//        System.out.println(y);//70987
//
//        Widening with explicit
//        short s1=500;
//        double y1=(double)70987;
//        System.out.println(s1);
//        System.out.println(y1);
//
//        Narrowing with implicit
//        double num=98765432198.9087;
//        int b=num;
//        System.out.println(b);//getting error like "possible lossy conversion from double to int".
//
//
//
//        Narrowing with explicit
//        int num1=(int)987654321;
//        System.out.println(num1);//987654321
//
//        2)
//        int a=10;
//        System.out.println(--a + a-- + a--); //26
//        System.out.println(a); //7
//
//        3)
//
//        int a=10;
//        System.out.println(--a + a++ + a--); //28
//        System.out.println(a); //9
//
//        4)
//        int a=10;
//        System.out.println(a-- + a--  + a--); //27
//        System.out.println(a); //7
    }

}
