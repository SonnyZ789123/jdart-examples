package analysis.simple;

public class StringInput {

    // Strings are not a primitive type, unsupported.
    public static String foo(String s) {
        if (s == null) {
            return "null";
        }

        if (s.length() == 0) {
            return "empty";
        }

        if (s.equals("hello")) {
            return "greeting";
        }

        if (s.contains("test")) {
            return "contains test";
        }

        return "other";
    }

    public static void main(String[] args) {
        String input = "hello test";
        String result = foo(input);
        System.out.println("Result = " + result);
    }
}
