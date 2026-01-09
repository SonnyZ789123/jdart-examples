package test.diverged;

import java.util.Random;

public class Test {

    public static int foo(int x) {
        System.out.println("\n-------- In foo! Parameters = x:" + x);

        Random rand = new Random();
        int y = rand.nextInt(10);
        switch (y) {
            case 0: return 0;
            case 2: return 2;
            case 4: return 4;
            case 8: return 8;
            default: break;
        }

        if (x == y) {
            System.out.println("x equals y! y = " + y);
            return x;
        } else {
            System.out.println("x does not equal y! returning -1. y = " + y);
            return -1;
        }

    }

    public static void main(String[] args) {
        foo(5);
    }
}
