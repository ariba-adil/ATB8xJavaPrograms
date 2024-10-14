package oct.ex_11102024.superKeyword;

import jdk.incubator.vector.VectorOperators;

public class Lab141 {
    public static void main(String [] args) {
        BaseClass t1 = new TestCase1(); //dynamic dispatch
        //TestCase1 t2 = new BaseClass(); // not possible
        t1.openBrowser();
        t1.openBrowser("edge");
        t1.closeBrowser();
    }
}
