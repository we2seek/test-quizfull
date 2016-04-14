package attempt2.test;

public class DivisionTest {
    public static void main(String[] args) {
        int i = 0;
        double d = 0;


        try {
            System.out.println(i / d);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }


        try {
            System.out.println(d / d);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }


        try {
            System.out.println(d / i);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }

        try {
            System.out.println(i / i);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}
