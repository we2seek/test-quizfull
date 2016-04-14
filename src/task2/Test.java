package task2;

/**
 * Created by Vitaliy Timchenko on 14.04.16 15:59.
 */
public class Test {
    private static Boolean b1, b2;

    public static void main(String[] args) {
        if (b1 || !b2 || !b1 || b2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
