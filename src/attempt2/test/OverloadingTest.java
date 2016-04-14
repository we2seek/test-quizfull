package attempt2.test;

class A1 {}
interface I1 {}
class B1 extends A1 implements I1 {}

public class OverloadingTest {
    static private void foo(A1 a1){
        System.out.println("A1");
    }

    static private void foo(B1 b1){
        System.out.println("B1");
    }

    static private void foo(I1 i1){
        System.out.println("I1");
    }

    public static void main(String[] args) {
        A1 a = new B1();
        B1 b = new B1();
        I1 i = new B1();

        foo(a);
        foo(b);
        foo(i);
    }
}
