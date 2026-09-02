// Logan Vanhuffel
//p. 81

import java.util.Scanner;

public class ChiliToGoProfit 
{
    public static void main(String[] args)
    {
        double adultMealCost = 7.00;
        double childMealCost = 4.00;
        double adultMealProd = 4.35;
        double childMealProd = 3.10;
        int adultMeal;
        int childMeal;
        
        try (Scanner input = new Scanner(System.in)){

        System.out.print("Please enter the number of adult meals: ");
        adultMeal = input.nextInt();
        System.out.print("Please enter the number of child meals: ");
        childMeal = input.nextInt();

        double adultMealProfit = adultMeal * (adultMealCost - adultMealProd);
        double childMealProfit = childMeal * (childMealCost - childMealProd);
        double totalProfit = adultMealProfit + childMealProfit;

        System.out.printf("Total profit from adult meals: $%.2f\n", adultMealProfit);
        System.out.printf("Total profit from child meals: $%.2f\n", childMealProfit);
        System.out.printf("Total profit from all meals: $%.2f\n", totalProfit);
        }
    }
}
