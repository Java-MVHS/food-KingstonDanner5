/* Kingston Danner
 * 10/23/24
 * DeepDishPizza.java
 *
 * This class represents a specific type of pizza, known as "deep dish pizza." 
 * DeepDishPizza is a subclass of Pizza, which is a subclass of Food.
 * This class builds upon the basic properties of Pizza by setting the default name to "deep dish pizza."
 * It also provides an overloaded constructor to allow customization of the preparation method.
 */

 public class DeepDishPizza extends Pizza {

    // Constructor for DeepDishPizza that accepts only an ingredient
    // It sets the name to "deep dish pizza" and uses the default "baked" prep method from Pizza
    public DeepDishPizza(String ingredientIn) {
        // Calls the superclass (Pizza) constructor with the provided ingredient
        super(ingredientIn);
        
        // Modifies the str attribute to specifically reference "deep dish pizza"
        this.str = "At the sale: deep dish pizza baked with " + ingredientIn;
    }

    // Overloaded constructor for DeepDishPizza that allows a custom preparation method
    public DeepDishPizza(String prepMethod, String ingredientIn) {
        // Calls the superclass (Pizza) constructor to handle the ingredient
        super(ingredientIn);
        
        // Modifies the str attribute to include a custom preparation method for "deep dish pizza"
        this.str = "At the sale: deep dish pizza " + prepMethod + " with " + ingredientIn;
    }
}
