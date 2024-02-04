import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TempConvert {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);

        System.out.print("Please enter the temperature in Celsius ");
        String input = s.nextLine();
        double Temp = Integer.parseInt(input); // User input
        double TempF = Temp * 9/5 + 32;

        // Create the frame (window)
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame title
        frame.setTitle("Temperature in F");

        // Add a label with some text to the frame
        frame.add(new JLabel("The Temperature is "+TempF));

        // Always on Top
        frame.setAlwaysOnTop(true);
        // Set frame size
        frame.setSize(500, 500);

        // Make the frame visible
        frame.setVisible(true);
    }
}
