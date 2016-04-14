package task4;

public class Foo {
    public static void main(String[] args) {
        for (int k = 1; k <= 10; k++) {
//            if (k % 5 == 0) break label;
            System.out.print(k + " ");
        }


        {
            System.out.print("stop!");
        }
    }
}