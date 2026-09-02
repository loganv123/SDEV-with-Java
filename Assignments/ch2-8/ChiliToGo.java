// Logan Vanhuffel
//p. 81

import java.util.Scanner;

public class ChiliToGo 
{
    public static void main(String[] args)
    {
        double adultMealCost = 7.00;
        double childMealCost = 4.00;
        int adultMeal;
        int childMeal;
        
        try (Scanner input = new Scanner(System.in)){

        System.out.print("Please enter the number of adult meals: ");
        adultMeal = input.nextInt();
        System.out.print("Please enter the number of child meals: ");
        childMeal = input.nextInt();

        double adultMealTotal = adultMeal * adultMealCost;
        double childMealTotal = childMeal * childMealCost;
        double total = adultMealTotal + childMealTotal;

        System.out.printf("Total cost of adult meals: $%.2f\n", adultMealTotal);
        System.out.printf("Total cost of child meals: $%.2f\n", childMealTotal);
        System.out.printf("Total cost of all meals: $%.2f\n", total);
        }
    }
}
