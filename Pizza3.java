/* Kingston Danner
 * 10/23/24
 * Pizza3.java
 * 
 * Pizza3 is a subclass of Food3, representing a generic pizza. 
 * All values are input in FoodTester.
 */

 public class Pizza3 extends Food3 {   // Defines the Pizza subclass, linking it to Food3 with inheritance

    // Constructor for Pizza3 that accepts an ingredient, cost, and count
    public Pizza3(String ingredientIn, int costIn, int countIn) {    
        // Calls the Food3 superclass constructor with "baked" preparation method and "pizza" as the name
        super("baked", ingredientIn, "pizza", costIn, countIn); // values are input in FoodTester
    }
    
    // Overloaded constructor that allows a custom name for the pizza
    public Pizza3(String ingredientIn, String nameIn, int costIn, int countIn) {
        // Calls the Food3 superclass constructor with "baked" preparation method and custom name
        super("baked", ingredientIn, nameIn, costIn, countIn); // values are passed from DeepDishPizza
    }
}
