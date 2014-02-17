package Duck;

public class ModelDuck extends MyDuck {
    public ModelDuck() {
    	quackBehaviour = new Quack();
    	flyBehaviour = new NoFly();
    }
    
    public void display() {
    	System.out.println("I m model duck");
    }
}
