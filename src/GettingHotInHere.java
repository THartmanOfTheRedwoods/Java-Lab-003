import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        float temp;
        System.out.print("What is the temperature in °F: ");
        Scanner sc= new Scanner(System.in);
        temp=sc.nextFloat();
        temp=((temp - 32)*5)/9;
        System.out.println("If it were 2°C warmer it would be:" + 2 + temp );
    }
}
