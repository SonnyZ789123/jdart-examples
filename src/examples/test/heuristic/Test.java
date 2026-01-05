package test.heuristic;

public class Test {

    public static int foo(int x) {

        if (x < 5) {

            if (x < 3) {
                switch (x) {
                    case 0: return 0;
                    case 1: return 1;
                    default: return 2;
                }
            } else {
                switch (x)  {
                    case 3: return 3;
                    case 4: return 4;
                    default: return x;
                }
            }

        } else if (x < 10) {

            if (x != 7) {

                if (x > 7) {
                    switch (x) {
                        case 8: return 8;
                        case 9: return 9;
                        default: return x;
                    }
                } else {
                    switch (x) {
                        case 5: return 5;
                        case 6: return 6;
                        default: return x;
                    }
                }

            } else {
                return 7;
            }

        } else {

            if (x == 10) {
                return 10;
            } else if (x == 11) {
                return 11;
            } else if (x == 12) {
                return 12;
            } else if (x == 13) {
                return 13;
            } else if (x == 14) {
                return 14;
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        foo(5);
    }
}
