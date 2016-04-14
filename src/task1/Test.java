package task1;

/**
 * Created by Vitaliy Timchenko on 14.04.16 15:54.
 */
public class Test {
    private void method1() {
        MyClass obj = new MyClass();
        obj.x = 1;
        method2(obj);
        System.out.println("obj.x="+obj.x);
    }

    private void method2(MyClass param) {
        param.x = 2;
        param = new MyClass();
        param.x = 3;
    }

    class MyClass {
        int x;
    }

    public static void main(String[] args) {
        new Test().method1();
    }
}
