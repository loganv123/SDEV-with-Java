// Logan Vanhuffel
// p.252
import javax.swing.*;

public class NumberInput 
{
    public static void main(String[] args)
    {
        String inputString;
        int inputNumber;
        int result;

        final int FACTOR = 10;

        inputString = JOptionPane.showInputDialog(null, "Please enter a number: ");

        inputNumber = Integer.parseInt(inputString);
        result = inputNumber * FACTOR;
        JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
    }
}
