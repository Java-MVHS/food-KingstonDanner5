/* Kingston Danner
* 10/23/24
* FoodTester.java
* 
* This program tests instances of Food3, Pizza3, and DeepDishPizza3 classes. 
* It demonstrates inheritance by creating objects from these classes and printing details.
*/

public class FoodTester3 {
   public static void main(String[] args) {
       // Instance of FoodTester3 to call method for printing new lines
       FoodTester3 ft = new FoodTester3(); 
       ft.newLines(); // Prints three new lines
       
       // Creates an instance of Food3 with specific preparation, ingredient, name, cost, and count
       Food3 food1 = new Food3("baked", "banana", "muffins", 50, 12);
       food1.printForSale();
       
       // Another instance of Food3 with different parameters
       Food3 food2 = new Food3("fried", "yam", "fritters", 100, 3); 
       food2.printForSale();
       
       // Creates an instance of Pizza3 with a specific ingredient, cost, and count
       Pizza3 pizza = new Pizza3("pepperoni", 250, 8); 
       pizza.printForSale();
       
       // Creates an instance of DeepDishPizza3 with a specific ingredient, cost, and count
       DeepDishPizza3 ddpizza = new DeepDishPizza3("cheese", 300, 10); 
       ddpizza.printForSale();
       
       ft.newLines(); // Prints three new lines at the end
   }

   // Method to print three new lines
   public void newLines() {
       System.out.print("\n\n\n");
   }
}
{
    
}
