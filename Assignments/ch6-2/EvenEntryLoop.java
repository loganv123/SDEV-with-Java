//Logan Vanhuffel
//p.232

import java.util.Scanner;
public class EvenEntryLoop 
{
    public static void main(String[] args)
    {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an even number or 999 to quit: ");
        number = input.nextInt();

        while(number != 999)
            if(number % 2 == 0)
                {
                    System.out.println("Good job ");
                    System.out.print("Enter another even number or 999 to quit: ");
                    number = input.nextInt();
                }
            else
                {
                    System.out.println("Not an even number ");
                    System.out.print("Please enter an even number or 999 to quit: ");
                    number = input.nextInt();
                }
        System.out.println("Thank you for running the program.");
    }    
}
