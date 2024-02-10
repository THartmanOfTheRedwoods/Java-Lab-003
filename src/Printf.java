public class Printf {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.75;
        System.out.printf("Displaying an int using %%f: %f\n", intValue);
        System.out.printf("Displaying a double using %%d: %d\n", doubleValue);
        System.out.printf("Providing only one value for two format specifiers: %d %f\n", intValue);
    }
}