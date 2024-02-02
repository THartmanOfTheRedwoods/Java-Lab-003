import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        double F;
        double C;
        Scanner in = new Scanner(System.in);
        System.out.print("Input temperature:  ");
        C = in.nextDouble();
        System.out.println("You input " + C + "C");
        F = (C * 9 / 5) + 32;
        System.out.println(C + "C" + " = " + F + "F");
        in.close();
    }
}
