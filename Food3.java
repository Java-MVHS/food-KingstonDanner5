/* Kingston Danner
 * 10/23/24
 * Food.java
 * 
 * This program demonstrates understanding of inheritance. 
 * Two objects are instantiated in FoodTester, linked to Food. 
 * Pizza is a subclass of Food, and DeepDishPizza is a subclass of Pizza.
 */

 public class Food3 {
    protected String str = "";           // Description of the item for sale
    protected String revenue = "";       // Revenue generated from the sale

    // Default constructor for Food3
    public Food3() {
        str = new String("");
    }
    
    // Overloaded constructor with parameters for preparation method, ingredient, name, cost, and count
    public Food3(String prepMethod, String ingredient, String name, int costIn, int countIn) {    
        // Calculates revenue and formats it as a dollar amount
        revenue = String.format("$%.2f", (double)costIn * countIn / 100.0); 
        // Creates a descriptive sale message using provided details
        str = "At the sale: " + name + " " + prepMethod + 
              " with " + ingredient + " will be sold for " + costIn + " cents each." +
              " With " + countIn + " " + name + "(s), " + revenue + " can be made.";
    }

    // Method to print the sale description
    public void printForSale() {
        System.out.println(str);
    }
}
