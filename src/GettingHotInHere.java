import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F:");
        int temp = scanner.nextInt();
        double Y = (temp-32)*(5.0 / 9.0);
        int value = (int)Y;
        String If = "If it were 2°C warmer it would be: " + (Y+2) + "°C";
        System.out.println(temp +"°F");
        System.out.println(Y+ "°C");
        System.out.println(value+ "°C");
        System.out.println(If);
    }

}
