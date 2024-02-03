public class FormatSpecifier {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;

        System.out.printf("Incorrect: %f%n", intValue);
        System.out.printf("Incorrect: %d%n", doubleValue);
    }
}
