import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.print("Enter a temperature in Celsius:");
double c = scanner.nextDouble();
double f = c * 9/5 + 32;
System.out.printf("%.1f C = %.1f F%n", c, f);
    }
}
