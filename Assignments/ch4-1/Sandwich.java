public class Sandwich 
{
    private String breadType;
    private String mainIngredient;
    private double price;

    /*public Sandwich(String bread, String main, double pr)
    {
        breadType = bread;
        mainIngredient = main;
        price = pr;
    }*/

    public void setBreadType(String bread)
    {
        breadType = bread;
    }

    public void setMainIngredient(String main)
    {
        mainIngredient = main;
    }

    public void setPrice(double pr)
    {
        price = pr;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }

    public double getPrice()
    {
        return price;
    }
}
