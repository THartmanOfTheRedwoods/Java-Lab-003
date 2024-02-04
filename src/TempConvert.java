import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a temperature in Celsius: ");
        double C,F;
        C=in.nextDouble();
       System.out.println("Enter a temperature in Celsius: " +C);
       F= C*(9.0/5.0)+32;
       System.out.printf("%.1f C = %.1f F", C, F);
    }
}
