package oct.ex_14102024.abstraction;

public class Lab150 {
}

interface I1{}
interface I2{}
class A {}
class B {}

class Test1 extends A {} //single inheritance
//class Test2 extends A,B {} //multiple inheritance never possible using class
class Test3 implements I1 {}
class Test4 implements I1, I2 {} //multiple inheritance possible using interfaces
class test5 extends A implements I1, I2 {}
//class Test6 implements I1 extends A{} //not possible

