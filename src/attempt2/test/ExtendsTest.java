package attempt2.test;

class A {
    void a() {
        System.out.println("A-a");
    }

    void b() {
        System.out.println("A-b");
        a();
    }
}

class B extends A {
    void a() {
        System.out.println("B-a");
    }

    void b() {
        System.out.println("B-b");
        super.b();
    }
}

public class ExtendsTest {


    public static void main(String[] args) {
        A a = new B();
        a.b();
    }
}
