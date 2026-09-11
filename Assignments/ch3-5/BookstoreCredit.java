// Logan Vanhuffel
// p.112
import java.util.Scanner;

public class BookstoreCredit 
{
    public static void main(String[] args)
    {
        double gpa;
        String name;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your GPA: ");
        gpa = keyboard.nextDouble();
        
        double credit = calculateCredit(gpa);
        System.out.print("Hello, " + name + "! Your GPA of " + gpa + " earns you a bookstore credit of $" + credit);
        keyboard.close();  
    }

    public static double calculateCredit(double gpa)
    {
        double credit;
        credit = gpa * 10;
        return credit;
    }
}
