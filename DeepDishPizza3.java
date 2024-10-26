/* Kingston Danner
 * 10/23/24
 * DeepDishPizza3.java
 * 
 * Subclass of Pizza3 that represents a deep dish pizza.
 */

 public class DeepDishPizza3 extends Pizza3 {

    // Constructor for DeepDishPizza3, which takes an ingredient, cost, and count as inputs
    public DeepDishPizza3(String ingredientIn, int costIn, int countIn) {
        // Calls the superclass (Pizza3) constructor with type set as "deep dish pizza"
        super(ingredientIn, "deep dish pizza", costIn, countIn); // values are inputted in Food tester
    }
}
