package Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
    	name = "Chicago Style Cheese Pizza";
    	dough = "Thick crust";
    	sauce = "Rick Marinara souce";
    	
    	toppings.add("Cheese");
    }
    
    void cut() {
    	System.out.println("Round pieces");
    }
}
