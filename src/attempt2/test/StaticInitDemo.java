package attempt2.test;

class Inner {
    static int i0 = 1;
    static int i1;

    static {
        for (int i = 0; i < 10; i++) {
            i1 = i;
        }
        System.out.println("i1 = " + i1);
    }

    int i2 = 1;
    int i3 = 1;

    {
        i3 = 3;
    }

    int i4 = 1;

    Inner() {
        i4 = 2;

        System.out.println("i0=" + i0);
        System.out.println("i1=" + i1);
        System.out.println("i2=" + i2);
        System.out.println("i3=" + i3);
        System.out.println("i4=" + i4);
    }
}

public class StaticInitDemo {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Before classloading...");
        Class.forName(Inner.class.getName());
        System.out.println("After classloading...");

        Inner i = new Inner();

    }
}
