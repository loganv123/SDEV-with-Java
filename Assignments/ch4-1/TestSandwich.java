// Logan Vanhuffel
// p.156

import java.util.Scanner;

public class TestSandwich 
{
    public static void main(String[] args )
    {
        Sandwich firstSandwich = new Sandwich();

        firstSandwich = getData(firstSandwich);

        System.out.println("You ordered a " + firstSandwich.getBreadType() 
            + " sandwich with " + firstSandwich.getMainIngredient() 
            + " for $" + firstSandwich.getPrice());
    }

    public static Sandwich getData(Sandwich sandwich)
    {
        String breadType;
        String mainIngredient;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter bread type: ");
        breadType = keyboard.nextLine();
        System.out.print("Enter main ingredient: ");
        mainIngredient = keyboard.nextLine();
        System.out.print("Enter price: ");
        price = keyboard.nextDouble();

        sandwich.setBreadType(breadType);
        sandwich.setMainIngredient(mainIngredient);
        sandwich.setPrice(price);
        return sandwich;

    }
}
